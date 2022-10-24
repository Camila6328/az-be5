package Servlet2;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class ServerApp {
    public static void main(String[] args) throws Exception {
        Server server = new Server(1111);
        ServletContextHandler handler = new ServletContextHandler();
        handler.addServlet(new ServletHolder(new ShowTextFileServlet()),"/showtextfile");
        handler.addServlet(new ServletHolder(new StaticFileServlet()),"/*");
        handler.addServlet(new ServletHolder(new ShowDynamictextFileServlet()),"/dynamic");
        handler.addServlet(new ServletHolder(new ShowDynamictextFileServlet2()), "/dynamic2");
        handler.addServlet(new ServletHolder(new FormServlet()), "/formServlet");



//        handler.addServlet(new ServletHolder(new HpFileServlet()),"/hp.jpg");
//        handler.addServlet(new ServletHolder(new IbmFileServlet()),"/ibm.png");

        server.setHandler(handler);
        server.start();
        server.join();
    }
}
