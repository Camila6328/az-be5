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
import java.util.ArrayList;
import java.util.HashMap;

public class ShowDynamictextFileServlet2 extends HttpServlet {
    //http://localhost:1111/dynamic2
@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Configuration conf = new Configuration(Configuration.VERSION_2_3_28);
    conf.setDefaultEncoding(String.valueOf(StandardCharsets.UTF_8));
    conf.setDirectoryForTemplateLoading(new File("src/main/java/Servlet2"));

    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student( "Jim","30","b1"));
    students.add(new Student( "Alex","26","b2"));
    students.add(new Student( "Jane","25","a1"));

    HashMap<String, Object> data = new HashMap<>();
    data.put("data", students);

    try (PrintWriter w = resp.getWriter()) {
        conf.getTemplate("formUserList.ftl").process(data,w);
    } catch (TemplateException e) {
        throw new RuntimeException(e);
    }
}
}
