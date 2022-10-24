package TinderProject;

import TinderProject.DAO.LikesDAO;
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
import java.util.HashMap;

import static TinderProject.Database.ConnectionDB.conn;

public class MessageIdTest extends HttpServlet {
    @SneakyThrows
    @Override
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {

        Configuration conf = new Configuration(Configuration.VERSION_2_3_28);
        conf.setDefaultEncoding(String.valueOf(StandardCharsets.UTF_8));
        conf.setDirectoryForTemplateLoading(new File("src/main/java/TinderProject"));

        HashMap<String, Object> data = new HashMap<>();
        LikesDAO ld = new LikesDAO(conn);
        try (PrintWriter w = rs.getWriter()) {

                conf.getTemplate("Chat.html").process(data, w);


        } catch (TemplateException e) {
            throw new RuntimeException(e);
        }
    }
}
