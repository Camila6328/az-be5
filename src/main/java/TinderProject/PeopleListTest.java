package TinderProject;

import TinderProject.DAO.LikesDAO;
import TinderProject.DAO.UsersDAO;
import TinderProject.Objects.Likes;
import TinderProject.Objects.User;
import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import static TinderProject.DAO.UsersDAO.likedUsers;
import static TinderProject.Database.ConnectionDB.conn;
public class PeopleListTest extends HttpServlet {

    UsersDAO ud = new UsersDAO(conn);
    LikesDAO ld = new LikesDAO(conn);

    private final Counter c;
    public PeopleListTest(Counter c) {
        this.c = c;
    }
    public void checkSize(Counter c, int size) {
        if (size > c.get()) {
            c.inc();
        } else {
            c.zero();
        }
    }
    ArrayList<User> users = ud.getAll();
    ArrayList<User> newUsers = new ArrayList<>();
    int userListSize = users.size();

    @SneakyThrows
    @Override
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        var usersCon = config("TestStepProject.ftl",rs);
    }
    @Override
    protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        var usersCon = config("TestStepProject.ftl",rs);
        likedUsers.add(usersCon.get(c.get()));
        Likes likeduser = new Likes(likedUsers.get(c.get()).getId(),likedUsers.get(c.get()).getUsername(),
                "yes","no",new Date());
        ld.put(likeduser);

    }
    private List<User> config(String fileName,HttpServletResponse rs) throws ServletException, IOException {
        Configuration conf = new Configuration(Configuration.VERSION_2_3_28);
        conf.setDefaultEncoding(String.valueOf(StandardCharsets.UTF_8));
        conf.setDirectoryForTemplateLoading(new File("src/main/java/TinderProject"));

        HashMap<String, Object> data = new HashMap<>();

        int ind = c.get();

        checkSize(c, userListSize - 1);

        try (PrintWriter w = rs.getWriter()) {
            data.put("name", users.get(ind).getUsername());
            data.put("photo", users.get(ind).getImg());
            if (ud.getCount() == newUsers.size()){
                rs.sendRedirect("http://localhost:8080/liked");
          // w.println("ssss");
            }
            else {
                newUsers.add(users.get(ind));
              // w.println(ud.getCount() + " " +(newUsers.size()) +" " + users.get(ind).getUsername() + " " );
               conf.getTemplate(fileName).process(data, w);
            }

        } catch (TemplateException e) {
            throw new RuntimeException(e);
        }
        return users;
    }
    }
