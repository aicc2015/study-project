package com.hcc.studyproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.hcc.studyproject")
public class StudyProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyProjectApplication.class, args);
    }
}
