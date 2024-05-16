package com.mycompany.maquette_tomcat10.resources;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;


@ApplicationPath("/api")
public class DemoApp extends ResourceConfig {
    public DemoApp() {
        packages("com.mycompany.maquette_tomcat10.resources");
    }
}
