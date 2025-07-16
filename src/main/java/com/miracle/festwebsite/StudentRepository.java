package com.miracle.festwebsite;

import com.miracle.festwebsite.service.StudentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentInfo, Integer> {


    List<StudentInfo> findAllByEmailContaining(String email);

    StudentInfo findByEmail(String email);


}

