package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Repositories.ChildRepo;
import com.example.demo.model.Child;

@Service
public class ApiService {
	@Autowired
	ChildRepo repository;
	public boolean AddChild(Child ch) {
		repository.save(ch);
		return true;
	}
	public List<Child> getChildSorted(String field){
		return repository.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	public List<Child> getChildPaginated(int offset, int pageSize){
		Page<Child> page=repository.findAll(PageRequest.of(offset, pageSize));
		return page.getContent();
	}
	public List<Child> getChildWithPaginationAndSorting(int offset, int pageSize, String field) {
		Page<Child>page=repository.findAll(PageRequest.of(offset, pageSize,Sort.by(field)));
		return page.getContent();
		
	}
	

}

