package TinderProject;

import TinderProject.DAO.UsersDAO;
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
import java.util.HashMap;
import java.util.List;

import static TinderProject.DAO.UsersDAO.likedUsers;
import static TinderProject.Database.ConnectionDB.conn;
public class PeopleListTest extends HttpServlet {

    UsersDAO ud = new UsersDAO(conn);
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


    @SneakyThrows
    @Override
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        var usersCon = config(rs);

    }
    @Override
    protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        var usersCon = config(rs);
        likedUsers.add(usersCon.get(c.get()));

    }
    private List<User> config(HttpServletResponse rs) throws ServletException, IOException {
        Configuration conf = new Configuration(Configuration.VERSION_2_3_28);
        conf.setDefaultEncoding(String.valueOf(StandardCharsets.UTF_8));
        conf.setDirectoryForTemplateLoading(new File("src/main/java/TinderProject"));

        HashMap<String, Object> data = new HashMap<>();
        ArrayList<User> users = ud.getAll();

        int ind = c.get();
        int userListSize = users.size();
        checkSize(c, userListSize - 1);

        try (PrintWriter w = rs.getWriter()) {
            data.put("name", users.get(ind).getUsername());
            data.put("photo", users.get(ind).getImg());
          //    w.println(ud.getCount());
            conf.getTemplate("TestStepProject.ftl").process(data, w);
        } catch (TemplateException e) {
            throw new RuntimeException(e);
        }
        return users;
    }
    }
