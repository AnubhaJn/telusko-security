package com.example.Security.Controllers;

import com.example.Security.DTO.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Test {

    private List<Student> list = new ArrayList<>(List.of(
            new Student(1,"Anubha","Java"),
            new Student(2,"Sachin","Microsrvices")
    ));
    @GetMapping("/getToken")
    public CsrfToken getToken(HttpServletRequest request){
       return (CsrfToken) request.getAttribute("_csrf");
    }
    @GetMapping("/hello")
    public String getHello(HttpServletRequest request){
        return "Hello" + request.getSession().getId();
    }

    @GetMapping("/Students")
    public List<Student> allStudents(){
        return list;
    }
    @PostMapping("/students")
    public void addStudent(@RequestBody Student student){
        list.add(student);
    }
}
