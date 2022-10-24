package tinder;

import freemarker.template.Configuration;
import freemarker.template.TemplateException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class LikedUserServlet extends HttpServlet  {
    //http://localhost:8081/liked
@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Configuration conf = new Configuration(Configuration.VERSION_2_3_28);
    conf.setDefaultEncoding(String.valueOf(StandardCharsets.UTF_8));
    conf.setDirectoryForTemplateLoading(new File("src/main/java/tinder"));

    HashMap<String, Object> dataUser = new HashMap<>();

    try (PrintWriter w = resp.getWriter()) {
        dataUser.put("data", addUserDAO.likedUsers);
        conf.getTemplate("formUserList.ftl").process(dataUser,w);
    } catch (TemplateException e) {
        throw new RuntimeException(e);
    }

}



}

