package com.greene.helloworldrest.Controller;

import com.greene.helloworldrest.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class StudentController {

    @GetMapping("/student/query")
    public Student studentQueryParam(@RequestParam(name="firstName") String firstName,
                                       @RequestParam(name="lastName") String lastName){
        return new Student(firstName, lastName);
    }
}
