package Servlet;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class ServerApp {
    public static void main(String[] args) throws Exception {
        Server server = new Server(1112);
          ServletContextHandler handler = new ServletContextHandler();
          handler.addServlet( HelloServlet.class,"/hello1");
          handler.addServlet( HtmlFormattedServlet.class,"/html");
        server.setHandler(handler);
        server.start();
        server.join();
    }
}
