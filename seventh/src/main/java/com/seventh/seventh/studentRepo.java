package com.seventh.seventh;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface studentRepo extends JpaRepository<Student,Integer>{
	
}
