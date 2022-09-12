package com.postgres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.postgres.dao.Employeedao;

@SpringBootApplication
public class BootwithpostgresApplication implements CommandLineRunner {
	@Autowired
	private Employeedao employeedao;
	public static void main(String[] args) {
		SpringApplication.run(BootwithpostgresApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
//		this.employeedao.createTable();
//		this.employeedao.insertTable(1,"Arnab",36000,"Hyderabad");
//		this.employeedao.insertTable(2,"Bhargav",39000,"Hyderabad");
//		this.employeedao.insertTable(3,"Chaitanya",31000,"Hyderabad");
//		this.employeedao.insertTable(4,"Praveen",46000,"Hyderabad");
//		this.employeedao.insertTable(5,"siddharth",71000,"Hyderabad");
//		
//		this.employeedao.fetchdata();
		
		this.employeedao.deleteData();
//		System.out.println("After Deleting");
		
//		this.employeedao.fetchdata();
	}
}
