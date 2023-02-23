package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositories.StudentRepo;
import com.example.demo.model.Student;

@Service
public class ApiService {
	@Autowired
	StudentRepo repository;
	
	public boolean addStudent(Student stu) {
		repository.save(stu);
		return true;
	}
	public List<Student> getStudent(){
		return repository.findAll();
	}
	
	public Optional<Student> getStudentById(int id){
		return repository.findById(id);
	}
	
	public String updateStudent(Student stu) {
		repository.save(stu);
		return "Updated";
	}
	
	public boolean deleteStudentById(int id) {
		repository.deleteById(id);
		return true;
	}

}

