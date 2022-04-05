package com.mastery.boot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.APRIL;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {

            Student mariam = new Student(
                    "Mariam",
                    "mariam@yahoo.com",
                    LocalDate.of(2000, APRIL, 5)
            );

            Student alex = new Student(
                    "Alex",
                    "mariam@yahoo.com",
                    LocalDate.of(2004, APRIL, 5)
            );

            Student jhon = new Student(
                    "jhon",
                    "mariam@yahoo.com",
                    LocalDate.of(2012, APRIL, 5)
            );

            repository.saveAll(
                    List.of(mariam, alex, jhon)
            );
        };
    }
}
