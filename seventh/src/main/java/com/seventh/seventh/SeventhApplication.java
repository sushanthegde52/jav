package com.seventh.seventh;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SeventhApplication {

	public static void main(String[] args) {
	ApplicationContext ac=SpringApplication.run(SeventhApplication.class, args);
		studentService s=ac.getBean(studentService.class);
		while(true) {
		System.out.println("1.insert\n 2.display \n 3.update \n 4.delete \n enter your choice");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		if(ch==1) {
			Student student=new Student();
			System.out.println("enter address ");
			String add=sc.next();
			System.out.println("enter name ");
			String name=sc.next();
			System.out.println("enter usn ");
			String usn=sc.next();
			System.out.println("enter marks ");
			int marks=sc.nextInt();
			student.setAddress(add);
			student.setName(name);
			student.setTotalmarks(marks);
			student.setUsn(usn);
			s.insert(student);
			System.out.println("Student added successfully");
			System.out.println(s.getAllStudents());
		}
		else if(ch==2) {
			System.out.println("Enter id to display!! ");
			int id=sc.nextInt();
			Student student=s.getById(id);
			System.out.println(student);
		}
		else if(ch==3) {
			System.out.println("Enter id to update!! ");
			int id=sc.nextInt();
			s.update(id);
			System.out.println("Marks updated Successfully");
			System.out.println(s.getAllStudents());
			
		}
		else if(ch==4) {
		
			System.out.println("Enter id to delete!! ");
			int id=sc.nextInt();
			s.delete(id);
			System.out.println("User deleted successfully");
			System.out.println(s.getAllStudents());
		}
		else {
			break;
		}
		}
		
	}

}
