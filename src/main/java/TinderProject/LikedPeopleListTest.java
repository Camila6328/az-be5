package TinderProject;

import TinderProject.DAO.UsersDAO;
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

import static TinderProject.DAO.UsersDAO.likedUsers;
import static TinderProject.Database.ConnectionDB.conn;

public class LikedPeopleListTest extends HttpServlet {
    UsersDAO ud = new UsersDAO(conn);

    @SneakyThrows
    @Override
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {

        Configuration conf = new Configuration(Configuration.VERSION_2_3_28);
        conf.setDefaultEncoding(String.valueOf(StandardCharsets.UTF_8));
        conf.setDirectoryForTemplateLoading(new File("src/main/java/TinderProject"));

        HashMap<String, Object> data = new HashMap<>();

        try (PrintWriter w = rs.getWriter()) {
            for (int i = 0; i < likedUsers.size(); i++) {
                data.put("name", likedUsers.get(i).getUsername());
                data.put("photo", likedUsers.get(i).getImg());
                conf.getTemplate("TestStepProject.ftl").process(data, w);
            }

        } catch (TemplateException e) {
            throw new RuntimeException(e);
        }
    }
}
