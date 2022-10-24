package Servlet2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
//    //http://localhost:1111/formServlet
public class FormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String fileName = getClass().getClassLoader().getResource("form.html").getFile();

    List<String> lines = Files.readAllLines(Path.of(fileName));
    try
        (PrintWriter w = resp.getWriter()){
        for(String line: lines) {
            w.println(line);
        }
    }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try
                (PrintWriter w = resp.getWriter()){
            String username = req.getParameter("username");
            String password = req.getParameter("password");
            w.printf("user entered: %s, %s", username, password);
        }
    }
}
