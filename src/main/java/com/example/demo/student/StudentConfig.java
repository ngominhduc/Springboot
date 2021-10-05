package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student duc = new Student(
                    1L,
                    "duc",
                    30,
                    LocalDate.of(2021, Month.JULY, 5),
                    "ngominhduc07@gmail.com"
            );

            Student ngo = new Student(
                    2L,
                    "ngo",
                    30,
                    LocalDate.of(2021, Month.JULY, 5),
                    "ngominhduc07@gmail.com"
            );

            repository.saveAll(
                    List.of(duc, ngo)
            );
        };
    }
}
