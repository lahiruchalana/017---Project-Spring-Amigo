package com.example.studiestutorials04amigosproject;

import com.example.studiestutorials04amigosproject.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping
    public List<Student> hello() {
        return List.of( new Student(11L,
                "Lahiru",
                "lahieuchalanairesh@gmail.com",
                LocalDate.of(1990, Month.AUGUST, 18),
                32)
        );
    }

//    @GetMapping
//    public String hello() {
//        return "hello world"; // provides normal String
//    }

//    @GetMapping
//    public List<String> hello() {
//        return List.of("hello", "world"); // provides JSON data
//    }

}
