package com.moktem.demo.resource;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.moktem.demo.StudentRepository;
import com.moktem.demo.model.Student;

@RestController
@RequestMapping
public class StudentResource {

	@Autowired
	StudentRepository repo;

	//@GetMapping(path = "student", produces = { "application/xml", "application/json" })
	@GetMapping(path = "student")
	public List<Student> getStudent() {
		return (List<Student>) repo.findAll();
	}

	@GetMapping("student/{id}")
	public Optional<Student> getStudentById(@PathVariable("id") int studentId) {
		Optional<Student> student = repo.findById(studentId);
		return student;
	}

	@PostMapping("student")
	public Student addStudent(@RequestBody Student student) {
		repo.save(student);
		return student;
	}


	@PutMapping("student")
	public Student saveOrUpdateStudent(@RequestBody Student student) {
		repo.save(student);
		return student;
	}


	@DeleteMapping("student/{id}")
	public String deleteStudent(@PathVariable("id") int studentId) {
		repo.deleteById(studentId);
		return "Deleted Successfully";
	}

	
}
