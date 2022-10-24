package Servlet2;

import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import tinder.Objects.User;
import tinder.addUserDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;

public class ShowTextFileServlet extends HttpServlet {
//http://localhost:1111/showtextfile
@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String badExample = "src/main/java/Servlet2/test1.html";
    String fileName = getClass().getClassLoader().getResource("test1.html").getFile();
    List<String> lines = Files.readAllLines(Path.of(fileName));

    try (PrintWriter w = resp.getWriter()){
        for(String line : lines) {
            w.println(line);
        }
     }
    }

    public static class LikedUserServletcopy extends HttpServlet  {
        //http://localhost:8081/liked

    @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Configuration conf = new Configuration(Configuration.VERSION_2_3_28);
        conf.setDefaultEncoding(String.valueOf(StandardCharsets.UTF_8));
        conf.setDirectoryForTemplateLoading(new File("src/main/java/tinder"));

        String fileName = getClass().getClassLoader().getResource("test1.html").getFile();
        List<String> lines = Files.readAllLines(Path.of(fileName));

        List<User> likedUsers = addUserDAO.likedUsers;
        HashMap<String, Object> dataUser = new HashMap<>();
        try (PrintWriter w = resp.getWriter()) {
            dataUser.put("data", likedUsers);
            conf.getTemplate("formUserList.ftl").process(dataUser,w);
    //        System.out.println(likedUsers.get(0));
        //    w.println(likedUsers.get(0).getUserId());
        } catch (TemplateException e) {
            throw new RuntimeException(e);
        }

    }

    }
}
