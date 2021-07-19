package com.example.demo.init;

import com.example.demo.models.Major;
import com.example.demo.models.Student;
import com.example.demo.services.MajorService;
import com.example.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleRunner implements CommandLineRunner {
    @Autowired
    private StudentService studentService;
    @Autowired
    private MajorService majorService;

    @Override
    public void run(String... args) throws Exception {

        Major major_it = new Major("IT");
        majorService.register(major_it);
        Major major_business = new Major("Business");
        majorService.register(major_business);

        Major major = majorService.findMajor(1);

        Student student = new Student("Petr", major_it);
        studentService.register(student);
        studentService.register(new Student("Ivan", major_it));
        studentService.register(new Student("Nikolay", major_business));

        studentService.findByMajor(major).forEach(System.out::println);
    }
}
