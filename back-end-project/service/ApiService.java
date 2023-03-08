package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Grocery;
import com.example.demo.repository.GroceryRepo;

@Service
public class ApiService {
	@Autowired
	GroceryRepo repository;
	public String addGrocery(Grocery gro) {
		repository.save(gro);
		return "Added";
	}
	public List<Grocery> getGrocery(){
		return repository.findAll();
	}
	
	public Optional<Grocery> getGroceryById(int productId){
		return repository.findById(productId);
	}
	
	public String updateGrocery(Grocery gro) {
		if(repository.existsById(gro.getProductId())){
		repository.save(gro);
		return "Updated";
		}
		else 
			return "User doesn't exists";
	}
	
	public String deleteGroceryById(int productId) {
		repository.deleteById(productId);
		return "Grocery deleted";
	}
	public List<Grocery> getGrocerySorted(String field){
		return repository.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	public List<Grocery> getGroceryPaginated(int offset,int pageSize){
		Page<Grocery> page=repository.findAll(PageRequest.of(offset, pageSize));
		return page.getContent();
	}
	public List<Grocery> getGroceryWithPaginationAndSorting(int offset, int pageSize, String field) {
		Page<Grocery>page=repository.findAll(PageRequest.of(offset, pageSize,Sort.by(field)));
		return page.getContent();	
	}

}


	
	

	
