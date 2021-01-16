package org.alex.springappic;

import org.alex.springappic.tomcat.TomcatLauncher;
import org.apache.catalina.LifecycleException;

public class SpringappIc {  
    
    public static void main(String[] args) {

        final TomcatLauncher tomcatLauncher = new TomcatLauncher(8080, "/");

        Thread tomcatThread = new Thread(() -> {
            try {
                tomcatLauncher.startEmbeddedServer();
            } catch (LifecycleException e) {
                throw new RuntimeException(e);
            }
        });
        tomcatThread.start();
    }
}
