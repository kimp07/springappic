package org.alex.springappic.tomcat;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;

import java.io.File;
import java.util.Calendar;

public class TomcatLauncher {

    public static final String WEB_APP_PATH = "src/main/webapp";
    private final int port;
    private final String webAppHost;

    public TomcatLauncher(int port, String webAppHost) {
        this.port = port;
        this.webAppHost = webAppHost;
    }

    public void startEmbeddedServer() throws LifecycleException {

        System.out.println("Starting Tomcat..");
        long seconds = Calendar.getInstance().getTimeInMillis(); // now

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(port);

        StandardContext context = (StandardContext) tomcat.addWebapp(webAppHost, new File(WEB_APP_PATH).getAbsolutePath());
        context.backgroundProcess();
        tomcat.start();
        long timeEllapsed = Calendar.getInstance().getTimeInMillis() - seconds;
        System.out.println("Tomcat started at " + (timeEllapsed / 1000) + " sec ");
        tomcat.getServer().await();
    }
}
