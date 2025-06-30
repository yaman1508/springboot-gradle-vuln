package com.sjprogramming.restapi.repository;

import com.sjprogramming.restapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query(value = "SELECT * FROM student WHERE branch = '" + ":branch" + "'", nativeQuery = true)
    List<Student> findByBranchReallyInsecure(String branch); // will trigger rule

}
