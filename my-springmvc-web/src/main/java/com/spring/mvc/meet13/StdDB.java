package com.spring.mvc.meet13;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class StdDB {
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void create(Student std) {
		String sql = "INSERT INTO student (id, name, age) values (?, ?, ?)";
		
		jdbcTemplate.update(sql, std.getId(), std.getName(), std.getAge());
		
	}

}
