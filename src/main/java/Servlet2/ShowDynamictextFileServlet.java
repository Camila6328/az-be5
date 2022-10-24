package Servlet2;

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

public class ShowDynamictextFileServlet extends HttpServlet {
    //http://localhost:1111/dynamic
@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Configuration conf = new Configuration(Configuration.VERSION_2_3_28);
    conf.setDefaultEncoding(String.valueOf(StandardCharsets.UTF_8));
    conf.setDirectoryForTemplateLoading(new File("src/main/java/Servlet2"));

    HashMap<String, String> data = new HashMap<>();
    data.put("name", "Jim");
    data.put("age", "33");
//    String fileName = getClass().getClassLoader().getResource("form2.ftl").getFile();
//    List<String> lines = Files.readAllLines(Path.of(fileName));

    try (PrintWriter w = resp.getWriter()) {
        conf.getTemplate("test2.ftl").process(data,w);
    } catch (TemplateException e) {
        throw new RuntimeException(e);
    }
}
}
