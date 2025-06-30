package com.sjprogramming.restapi.service;

import com.sjprogramming.restapi.entity.Student;
import com.sjprogramming.restapi.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {

    @Mock
    private StudentRepository studentRepository;

    @InjectMocks
    private StudentService studentService;

    @Test
    void shouldReturnStudentByRollNo() {
        // Arrange
        Student mockStudent = new Student(1, "Yaman", 87.5f, "CSE");
        Mockito.when(studentRepository.findById(1)).thenReturn(Optional.of(mockStudent));

        // Act
        Student student = studentService.getStudentById(1);

        // Assert
        assertEquals(1, student.getRollNo());
        assertEquals("Yaman", student.getName());
        assertEquals(87.5f, student.getPercentage());
        assertEquals("CSE", student.getBranch());
    }
    @Test
    void dummyTest() {
        String input = "' OR 1=1 --";
        System.out.println("Testing with input: " + input);
    }

}
