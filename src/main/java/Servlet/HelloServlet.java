package Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class HelloServlet extends HttpServlet {
//    http://localhost:1112/hello1?x=7&y=5&z=12
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//     System.out.println("hello");
//     req.getPathInfo();
//     req.getQueryString();
//     req.getPart("a");
//     req.getCookies();
//     req.getHeader();
     String wholeQueryString = req.getQueryString();
     Map<String,String[]> all = req.getParameterMap();
     String xs = req.getParameter("x");
     String ys = req.getParameter("y");
     String zs = req.getParameter("z"); // null
     int x = Integer.parseInt(xs);
     int y = Integer.parseInt(ys);
     int z = x + y;
     try (PrintWriter w = resp.getWriter()){
      w.println(wholeQueryString);
      w.printf("All params: %s \n",all);
          w.printf("Hello, %d, %d given, the sum is %d", x,y, z);
       }
    }
//        w.close();

 @Override
 protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  try (PrintWriter w = resp.getWriter()){
   w.println("handling POST");
   w.printf("Custom-Header: %s\n",req.getHeader("Custom-Header"));
   w.printf("user: %s\n", req.getParameter("user"));
   w.printf("password: %s\n",req.getParameter("password"));
  }
 }
}
