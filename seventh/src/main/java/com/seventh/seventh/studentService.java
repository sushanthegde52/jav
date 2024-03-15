package com.seventh.seventh;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentService {
	
	@Autowired
	public studentRepo studentRepo;
	
	
	public List<Student> getAllStudents(){
		return studentRepo.findAll();
	}
	
	public Student insert(Student s) {
		return studentRepo.save(s);
	}
	
	public Student getById(int id) {
		Student s=this.studentRepo.findById(id).get();
		return s;
	}
	
	public Student update(int id){
		Student s=this.studentRepo.findById(id).get();
		if(s!=null) {
			s.setTotalmarks(88);
			this.studentRepo.save(s);
		}
		return s;
		
	}
	
	public void delete(int id) {
		Student s=this.studentRepo.findById(id).get();
		this.studentRepo.delete(s);
	}
	
	

}
