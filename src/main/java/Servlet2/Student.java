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
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;

public class Student {
    String name;
    String age;
    String group;

    public Student(String name, String age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }

    // http://localhost:8081/users
    public static class FormMaven extends HttpServlet {

      /** showing form */
      @Override
      protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        Configuration conf = new Configuration(Configuration.VERSION_2_3_28);
        conf.setDefaultEncoding(String.valueOf(StandardCharsets.UTF_8));
        conf.setDirectoryForTemplateLoading(new File("src/main/java/tinder"));
        HashMap<String, String> data = new HashMap<>();
        data.put("name", "Jamila");

      try (PrintWriter w = rs.getWriter()){
            conf.getTemplate("form2.ftl").process(data,w);

        } catch (TemplateException e) {
          throw new RuntimeException(e);
        }
      }

      @Override
      protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        try (PrintWriter w = rs.getWriter()){
          String yes = rq.getParameter("yes");
          String no = rq.getParameter("no");
          w.printf("user entered: %s, %s", yes, no);
        }
      }
    }

    public static class ShowProfilesFileServlet extends HttpServlet {
    //http://localhost:8081/formProfiles
    @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fileName = getClass().getClassLoader().getResource("tinderApp/formProfiles.html").getFile();
        List<String> lines = Files.readAllLines(Path.of(fileName));

        try (PrintWriter w = resp.getWriter()){
            //for(String line : lines) {
                for (int i=0; i<lines.size() ; i++){
                w.println(lines.get(i));
            }
         }
        }
    }
}
