package Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HtmlFormattedServlet extends HttpServlet {
//    http://localhost:1112/html
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     try (PrintWriter w = resp.getWriter()){
            w.println("<html>");
            w.println("<body> ");
            w.println("<table border=\"1\"> ");
            w.println("    <tr> ");
            w.println("        <td>Iphone 14</td> ");
            w.println("        <td>2000</td> ");
            w.println("    </tr> ");
            w.println("</table> ");
            w.println("</body> ");
            w.println("</html");
    }
    }

}
