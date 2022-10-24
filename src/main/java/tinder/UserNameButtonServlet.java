package tinder;

import freemarker.template.Configuration;
import tinder.Objects.User;

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


public class UserNameButtonServlet extends HttpServlet {
    //http://localhost:8081/users
    private final Counter c;
    public UserNameButtonServlet(Counter c) {
        this.c = c;
    }

    public void checkSize(Counter c, int size) {
        if (size > c.get()) {
            c.inc();
        } else {
            c.zero();
        }
    }
    List<User> users = addUserDAO.addUsers();
    public static void main(String[] args) {
        List<User> users = addUserDAO.addUsers();
        System.out.println(users.size());
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getName());
        }
    }
    @Override
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        var usersCon = config(rs);

    }

    @Override
    protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        var usersCon = config(rs);
        // var data = addUser();
        addUserDAO.likedUsers.add(usersCon.get(c.get()));

    }
    private List<User> config(HttpServletResponse rs) throws ServletException, IOException {
        HashMap<String, String> data = new HashMap<>();
        data.put("name", "Jamila Garayeva");

        int ind = c.get();
        int userListSize = users.size();
        checkSize(c, userListSize - 1);

        Configuration conf = new Configuration(Configuration.VERSION_2_3_28);
        conf.setDefaultEncoding(String.valueOf(StandardCharsets.UTF_8));
        conf.setDirectoryForTemplateLoading(new File("src/main/java/tinder"));

        HashMap<String, Object> dataUser = new HashMap<>();

        try (PrintWriter w = rs.getWriter()) {
            ArrayList<User> new_users = new ArrayList<>();
            new_users.add(users.get(ind));

           // w.println("index " + ind + "  " + users.get(ind).getName());
            //        w.println("size " + users.size() + "  var_size " + userListSize +" index " + ind);
        w.println("index " + ind);
//        w.println("size " + users.size() + "  var_size " + userListSize);
//        w.println(users.get(ind).getUserId());
//        w.println(users.get(ind).getName());
//              if (ind  == users.size()) {
//                rs.sendRedirect("http://localhost:8081/liked");
//            }
            dataUser.put("data", new_users);
//            conf.getTemplate("form2.ftl").process(data, w);
//            conf.getTemplate("formUserList.ftl").process(dataUser, w);

//                for (int i = 0; i < addUserDAO.likedUsers.size(); i++) {
//                    w.println("index post" + i + "  " + addUserDAO.likedUsers.get(i).getName() );
//            }
//
//        } catch (TemplateException e) {
//            throw new RuntimeException(e);
        }
        return users;

    }
}
