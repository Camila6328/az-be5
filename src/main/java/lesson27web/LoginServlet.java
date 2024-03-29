package lesson27web;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Cookie cookie = SessionRelated.newRandom();
    resp.addCookie(cookie);
    try (PrintWriter w = resp.getWriter()) {
      w.printf("user successfully logged in, id = %s", cookie.getValue());
    }
  }
}
