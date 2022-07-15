package com.example.studiestutorials04amigosproject.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of( new Student(11L,
                "Lahiru",
                "lahieuchalanairesh@gmail.com",
                LocalDate.of(1990, Month.AUGUST, 18),
                32)
        );
    }

}
