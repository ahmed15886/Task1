package com.postgres.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Employeedao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void createTable () {
		String query = "CREATE TABLE IF NOT EXISTS employee(id SERIAL PRIMARY KEY, name VARCHAR(255) NOT NULL,salary INTEGER,city VARCHAR(255))";
		int update = this.jdbcTemplate.update(query);
		System.out.println("Constructor called "+update); 
	}
	public void insertTable(int id,String name,int sal,String city) {
//		String query = "INSERT INTO employee VALUES('1','Richard','120000','Hyderabad')";
		String query = "INSERT INTO employee VALUES(?,?,?,?)";
		int update = this.jdbcTemplate.update(query,id,name,sal,city);
		System.out.println(update);
	}
//	public void fetchdata() {
//		String query = "SELECT * FROM employee";
//		int update = this.jdbcTemplate.update(query);
//		System.out.println(update);
//	}
	public void deleteData() {
		String query = "DELETE FROM employee WHERE name='Chaitanya'";
		int update = this.jdbcTemplate.update(query);
		System.out.println(update);
	}
}
