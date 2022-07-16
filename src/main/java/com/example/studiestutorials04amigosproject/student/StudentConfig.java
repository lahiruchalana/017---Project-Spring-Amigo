package com.example.studiestutorials04amigosproject.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student lahiru = new Student(
                    "lahiru",
                    "lahiru@mail.com",
                    LocalDate.of(1999, Month.JANUARY, 18),
                    21
            );

            Student kasun = new Student(
                    "kasun",
                    "kasun@mail.com",
                    LocalDate.of(1989, Month.FEBRUARY, 18),
                    21
            );

            repository.saveAll(
                    List.of(lahiru, kasun)
            );
        };
    }
}
