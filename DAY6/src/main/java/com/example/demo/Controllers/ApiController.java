package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.ApiService;
import com.example.demo.model.Child;

@RestController
public class ApiController {
	@Autowired
	ApiService service;
	
	@PostMapping("/Child")
	public String AddChild(@RequestBody Child ch) {
		service.AddChild(ch);
		return "Added";
	}
	//Sorting
	@GetMapping("/Child/{field}")
	public List<Child> ChildSorted(@PathVariable String field){
		return service.getChildSorted(field);
	}
	//Pagination
	@GetMapping("/Child/{offset}/{pageSize}")
	public List<Child> ChildPaginate(@PathVariable int offset, @PathVariable int pageSize){
		return service.getChildPaginated(offset, pageSize);
	}
	//Sorting and Pagination
	@GetMapping("/Child/{offset}/{pageSize}/{field}")
	public List<Child> getChildWithPaginationAndSorting(@PathVariable int offset, @PathVariable int pageSize, @PathVariable String field){
	return service.getChildWithPaginationAndSorting(offset, pageSize, field); 
}

}


