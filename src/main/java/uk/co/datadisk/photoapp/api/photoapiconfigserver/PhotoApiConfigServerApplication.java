package uk.co.datadisk.photoapp.api.photoapiconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class PhotoApiConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoApiConfigServerApplication.class, args);
    }

}
