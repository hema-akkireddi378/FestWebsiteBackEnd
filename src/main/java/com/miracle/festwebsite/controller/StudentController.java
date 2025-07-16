package com.miracle.festwebsite.controller;



import com.miracle.festwebsite.StudentRepository;
import com.miracle.festwebsite.service.StudentInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class StudentController {


    private final StudentRepository repository;


    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }
    @PostMapping("/register")
    public StudentInfo post(
            @RequestBody StudentInfo studentInfo ){
        return repository.save(studentInfo);
    }

    @PostMapping("/signin")
    public ResponseEntity<String> studentSign(
            @RequestBody  StudentInfo studentInfo
    ){
        StudentInfo student = repository.findByEmail(studentInfo.getEmail());

        if(student == null){

            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Email not found");

        }

        return ResponseEntity.ok("Login Successful");

    }

}
