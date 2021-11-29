package com.spring.mvc.task14;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Student14DB {
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void create(Student std) {
		String sql = "INSERT INTO student (id, name, age) values (?, ?, ?)";
		
		jdbcTemplate.update(sql, std.getId(), std.getName(), std.getAge());
	}
	
	public List<Student> select() {
		String sql = "select * from student";
		
		List<Student> list = jdbcTemplate.query(sql, new Student14Mapper());
		return list;
	}
	
	public Student select(int seq) {
		String sql = "select * from student where seq=?";
		
		Student student = jdbcTemplate.queryForObject(sql, new Object[] {seq}, new Student14Mapper());
		return student;
	}
	public void update(Student student) {
		String sql = "update student set id=?, name=?, age=? where seq=?";
		
		jdbcTemplate.update(sql, student.getId(), student.getName(), student.getAge(), student.getSeq());
	}
	
	public int delete(int seq) {
		String sql = "delete from student where seq=?";
		
		return jdbcTemplate.update(sql, seq);
	}

}
