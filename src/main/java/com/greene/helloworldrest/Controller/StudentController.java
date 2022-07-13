package com.greene.helloworldrest.Controller;

import com.greene.helloworldrest.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class StudentController {

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students= new ArrayList<>();
        students.add(new Student("Ramesh", "Fadatare"));
        students.add(new Student("Tony", "Cena"));
        students.add(new Student("Sanjay", "Jadhav"));
        students.add(new Student("Ram", "Jadhav"));
        students.add(new Student("Umesh", "Fadatare"));
        return students;
    }
}
