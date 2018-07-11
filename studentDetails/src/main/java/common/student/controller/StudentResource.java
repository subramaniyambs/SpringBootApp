package common.student.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import common.student.model.StudentEntity;
import common.student.service.StudentRepository;

@RestController
public class StudentResource {
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/students")
	public List<StudentEntity> retrieveAllStudents() {
		return studentRepository.findAll();
	}
	
	@PostMapping("/students")
	public StudentEntity createStudent(@RequestBody StudentEntity student) {
		StudentEntity savedStudent = studentRepository.save(student);
	return savedStudent;	

	}
}
