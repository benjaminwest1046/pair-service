package com.thdpairs;
/*
 * Created by destruktobot on 1/14/17.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.time.LocalDate;

@SpringBootApplication
public class Application {
    @Autowired
    private DataSource dataSource;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        LocalDate currentTime = LocalDate.now();
        System.out.println(currentTime.toString());
    }
}