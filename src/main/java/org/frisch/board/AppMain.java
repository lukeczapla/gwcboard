package org.frisch.board;

/**
 * Created by luke on 11/18/16.
 */


import org.frisch.board.conf.SwaggerConfig;
import org.frisch.board.conf.WebSecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.io.IOException;

/**
 * Created by luke on 5/31/16.
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("frisch.java")
@Import({WebSecurityConfig.class, SwaggerConfig.class})
public class AppMain {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(AppMain.class, args);
    }

}
