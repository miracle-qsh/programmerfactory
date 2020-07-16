package com.junyan.programmerfactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class ProgrammerfactoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProgrammerfactoryApplication.class, args);
    }

}
