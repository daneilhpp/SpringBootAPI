package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig
{
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository)
    {
        return args -> {
            Student Daniel = new Student(
                    "Daniel",
                    "carvalhosilvad88@gmail.com",
                    LocalDate.of(2003, Month.SEPTEMBER,5)
            );

            Student Ste = new Student(
                    "Ste",
                    "amordaminhavida@teamo.com",
                    LocalDate.of(2000, Month.FEBRUARY,22)
            );

            Student Teste = new Student(
                    "Experimento",
                    "proveta@clone.com",
                    LocalDate.of(2021, Month.SEPTEMBER,2)
            );

            repository.saveAll(List.of(Daniel,Ste,Teste));
        };
    }
}
