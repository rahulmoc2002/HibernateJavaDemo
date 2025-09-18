package org.example;
import org.h2.tools.Server;

public class H2Console {

        // Start H2 web console
        public void startH2() throws Exception
        {
            Server server = Server.createWebServer("-web", "-webAllowOthers", "-tcp", "-tcpAllowOthers").start();
            System.out.println("H2 Console started at: " + server.getURL());
        }

    }
