package org.example;
import org.h2.tools.Server;

public class H2Console {
    public static void main(String[] args) throws Exception {
        // Start H2 web console
        Server server = Server.createWebServer("-web", "-webAllowOthers", "-tcp", "-tcpAllowOthers").start();
        System.out.println("H2 Console started at: " + server.getURL());
    }
}