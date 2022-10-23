package tinder;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class MavenApp {
    public static void main(String[] args) throws Exception {

        Server server = new Server(8081);
        ServletContextHandler handler = new ServletContextHandler();
        Counter counter = new Counter();



        UserNameButtonServlet userNameButtonServlet =  new UserNameButtonServlet(counter);
        handler.addServlet( new ServletHolder(userNameButtonServlet),"/users");

        handler.addServlet(new ServletHolder(new LikedUserServlet()),"/liked");


        server.setHandler(handler);
        server.start();
        server.join();
    }
}
