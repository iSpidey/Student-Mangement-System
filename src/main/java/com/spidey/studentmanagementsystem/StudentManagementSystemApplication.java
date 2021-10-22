package com.spidey.studentmanagementsystem;

import com.spidey.studentmanagementsystem.entity.Student;
import com.spidey.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

//		Student st1 = new Student("Siddhant", "Singh", "ss2206@gmail.com");
//		studentRepository.save(st1);
//
//		Student st2 = new Student("Peter", "Parker", "spidey@gmail.com");
//		studentRepository.save(st2);

	}

}
