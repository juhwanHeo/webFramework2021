package com.spring.mvc.task14;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Student14Mapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setSeq(rs.getInt("seq"));
		student.setId(rs.getString("id"));
		student.setName(rs.getString("name"));
		student.setAge(rs.getInt("age"));;
		
		return student;
	}
	
}
