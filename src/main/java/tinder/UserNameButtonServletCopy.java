package tinder;

import freemarker.template.Configuration;
import freemarker.template.TemplateException;
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

public class UserNameButtonServletCopy extends HttpServlet  {
    //http://localhost:8081/users
    private final Counter c;
    public UserNameButtonServletCopy(Counter c) {
        this.c = c;
    }
    public void checkSize(Counter c, int size ) {
        if (size - 1 > c.get()) {
            c.inc();
        } else {
            c.zero();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Configuration conf = new Configuration(Configuration.VERSION_2_3_28);
        conf.setDefaultEncoding(String.valueOf(StandardCharsets.UTF_8));
        conf.setDirectoryForTemplateLoading(new File("src/main/java/tinder"));

        List<User> users = addUserDAO.addUsers();
        HashMap<String, String> data = new HashMap<>();
        data.put("name", "Jamila Garayeva");
        HashMap<String, Object> dataUser = new HashMap<>();

        int userListSize = addUserDAO.addUsers().size();
        checkSize(c,userListSize-1);

        // resp.sendRedirect("http://localhost:8081/users");


        try (PrintWriter w = resp.getWriter()) {
            conf.getTemplate("form2.ftl").process(data,w);

            ArrayList<User> new_users = new ArrayList<>();
            new_users.add(users.get(c.get()));
            dataUser.put("data", new_users);

            conf.getTemplate("formUserList.ftl").process(dataUser,w);
        } catch (TemplateException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        Configuration conf = new Configuration(Configuration.VERSION_2_3_28);
        conf.setDefaultEncoding(String.valueOf(StandardCharsets.UTF_8));
        conf.setDirectoryForTemplateLoading(new File("src/main/java/tinder"));

        HashMap<String, String> data = new HashMap<>();
        data.put("name", "Jamila Garayeva");

        List<User> users = addUserDAO.addUsers();
        HashMap<String, Object> dataUser = new HashMap<>();

        int userListSize = addUserDAO.addUsers().size();
        checkSize(c,userListSize-1);

        try (PrintWriter w = rs.getWriter()) {
            String yes = rq.getParameter("yes");
            String no = rq.getParameter("no");
            //  w.printf("user entered: %s, %s", yes,no);

            ArrayList<User> new_users = new ArrayList<>();
            new_users.add(users.get(c.get()));
            dataUser.put("data", new_users);

            conf.getTemplate("formUserList.ftl").process(dataUser,w);

            addUserDAO.likedUsers.add(new_users.get(0));
            //   w.println("test success");


        } catch (TemplateException e) {
            throw new RuntimeException(e);
        }
    }

}

