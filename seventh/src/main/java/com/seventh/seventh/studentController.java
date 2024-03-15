package com.seventh.seventh;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class studentController {

	
	@Autowired
	public studentRepo sr;
	
	@GetMapping
	public List<Student> getAll(){
		return this.sr.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Student> getById(@PathVariable int id) {
		return this.sr.findById(id);
	}
	
	@PostMapping
	public Student getById(@RequestBody Student s){
		return this.sr.save(s);
	}
}
