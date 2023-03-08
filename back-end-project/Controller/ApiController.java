package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Grocery;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {

	@Autowired
	ApiService service;
	
	@PostMapping("/gro")
	@CrossOrigin(origins="http://localhost:3003")
	public String addGrocery(@RequestBody Grocery gro) {
		return service.addGrocery(gro);
	}
	@GetMapping("/gro")
	@CrossOrigin(origins="http://localhost:3003")
	public List<Grocery> read(){
		return service.getGrocery();
	}
	@GetMapping("/gro/{productId}")
	public Optional<Grocery> readById(@PathVariable int productId){
		return service.getGroceryById(productId);
	}
	@PutMapping("/gro")
	@CrossOrigin(origins="http://localhost:3003")
	public String update(@RequestBody Grocery gro) {
		return service.updateGrocery(gro);
	}
	
	@DeleteMapping("/gro/{productId}")
	@CrossOrigin(origins="http://localhost:3003")
	public String delete(@PathVariable int productId) {
		return service.deleteGroceryById(productId);
	}
	
	//Sorting
			@GetMapping("/gro/sort/{field}")
			public List<Grocery> GrocerySorted(@PathVariable String field){
				return service.getGrocerySorted(field);
			}
			//Pagination
			@GetMapping("/gro/{offset}/{pageSize}")
			public List<Grocery> GroceryPaginate(@PathVariable int offset, @PathVariable int pageSize){
				return service.getGroceryPaginated(offset, pageSize);
			}
			//Sorting and Pagination
			@GetMapping("/gro/{offset}/{pageSize}/{field}")
			public List<Grocery> getGroceryWithPaginationAndSorting(@PathVariable int offset, @PathVariable int pageSize, @PathVariable String field){
			return service.getGroceryWithPaginationAndSorting(offset, pageSize, field); 
			}

}




