package org.iegs.trucks.services.volvo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Launcher {

    public static void main(String[] args) {
        SpringApplication.run(Launcher.class);
    }

    // input initial data
    //@Bean
    //CommandLineRunner initData() {
    //    return null;
    //}
}
