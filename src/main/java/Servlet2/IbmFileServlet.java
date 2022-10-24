package Servlet2;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class IbmFileServlet extends HttpServlet {
//http://localhost:8080/hp.jpg
@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String fileName = getClass().getClassLoader().getResource("ibm.png").getFile();
  //  List<String> lines = Files.readAllLines(Path.of(fileName));

    try (ServletOutputStream os = resp.getOutputStream()){
        Files.copy(Path.of(fileName),os);
     }
    }
}
