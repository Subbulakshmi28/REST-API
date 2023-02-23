package com.example.demo.Controller;

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

import com.example.demo.Service.ApiService;
import com.example.demo.model.Student;

@RestController
@RequestMapping("/stu")
public class ApiController {
	@Autowired
	ApiService service;
	
	
	@PostMapping("")
	public boolean addStudent(@RequestBody Student stu) {
		return service.addStudent(stu);
	}
	@GetMapping("")
	public List<Student> read(){
		return service.getStudent();
	}
	@GetMapping("/{id}")
	public Optional<Student> readById(@PathVariable int id){
		return service.getStudentById(id);
	}
	@PutMapping("/{id}")
	public String update(@RequestBody Student stu) {
		return service.updateStudent(stu);
	}
	
	@DeleteMapping("/{id}")
	public boolean delete(@PathVariable int id) {
		return service.deleteStudentById(id);
	}

}

	
