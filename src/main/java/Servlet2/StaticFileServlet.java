package Servlet2;

import freemarker.template.Configuration;
import tinder.Counter;
import tinder.Objects.User;
import tinder.addUserDAO;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
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

public class StaticFileServlet extends HttpServlet {
//http://localhost:8080/t
@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String requestedName = req.getPathInfo();
    if(requestedName.startsWith("/")) requestedName = requestedName.substring(1);
    String fileName = getClass().getClassLoader().getResource(requestedName).getFile();
    System.out.println(fileName);
    try (ServletOutputStream os = resp.getOutputStream()){
        Files.copy(Path.of(fileName),os);
     }
    }

    public static class GetCounterServlet extends HttpServlet {

      private final Counter c;

      public GetCounterServlet(Counter c) {
        this.c = c;
      }


      @Override
      protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        try (PrintWriter w = rs.getWriter()){

//          w.printf("counted %d", c.get());
//
//          w.println("   " + addUserDAO.addUsers().get(c.get()).name);
//        }
      }
    }

    //http://localhost:8080/count
    public static class CountServlet extends HttpServlet {

      private final Counter c;

      public CountServlet(Counter c) {
        this.c = c;
      }

      @Override
      protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
//        if (addUserDAO.addUsers().size() -1 > c.get()) {
//          c.inc();
//        } else
//        {
//          c.zero();
//      }
        try (PrintWriter w = rs.getWriter()){
          w.println("counted...");
        }
      }
    }

    public static class addUsersDynamicFile extends HttpServlet  {
        private final Counter c;
        public addUsersDynamicFile(Counter c) {
            this.c = c;
        }
        //GetCounterServlet getCounterServlet = new GetCounterServlet(c);

        //http://localhost:8081/addUsersDynamicFile
    @Override
        protected void doGet(HttpServletRequest rq, HttpServletResponse resp) throws ServletException, IOException {
        Configuration conf = new Configuration(Configuration.VERSION_2_3_28);
        conf.setDefaultEncoding(String.valueOf(StandardCharsets.UTF_8));
        conf.setDirectoryForTemplateLoading(new File("src/main/java/tinder"));

        List<User> users = addUserDAO.addUsers();
        HashMap<String, Object> data = new HashMap<>();
        data.put("data", users);

        try (PrintWriter w = resp.getWriter()) {
            //  conf.getTemplate("formUserList.ftl").process(data,w);
//            w.printf("counted %d", c.get());
//            w.println("   " + addUserDAO.addUsers().get(c.get()).name);

            //      System.out.println(users.get(getCounterServlet.getId()).name);
    //        for (int i = 0; i < users.size(); i++) {
    //            w.println(users.get(i).photoUrl);
    //            w.println(users.get(i).name);
    //            System.out.println(users.get(i).photoUrl);
    //        }


        }}

        }

    // w.println(users.get(getCounterServlet.getId()).name);
    //
    //        System.out.println(users.get(getCounterServlet.getId()).name);
    }
}
