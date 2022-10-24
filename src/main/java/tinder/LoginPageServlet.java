package tinder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

//http://localhost:8081/login

public class LoginPageServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fileName = getClass().getClassLoader().getResource("login.html").getFile();
        Cookie cookie = SessionRelated.newRandom();
        resp.addCookie(cookie);
        List<String> lines = Files.readAllLines(Path.of(fileName));

        try (PrintWriter w = resp.getWriter()){
          //  w.printf("user successfully logged in, id = %s", cookie.getValue());
            for(String line: lines) {
                w.println(line);
            }
        }
    }



}
