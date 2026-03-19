package com.example.Security.controller;

import com.example.Security.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class StudentController {
    private List<Student> students= new ArrayList<>(List.of(
            new Student("Yahia",1,66),
            new Student("issa",2,56)
    ));
    @GetMapping("/students")
    public List<Student> getStudents(){
    return students;
    }
    @GetMapping("/csrf-token")
    public CsrfToken getToken(HttpServletRequest request){
    return (CsrfToken) request.getAttribute("_csrf");
    }
    @PostMapping("/students")
    public String addStudent(@RequestBody Student student){
        students.add(student);
        return "Welcome to Spring Boot Security"+student;
    }

}
