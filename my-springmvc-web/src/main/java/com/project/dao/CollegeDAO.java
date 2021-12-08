package com.project.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.vo.College;

@Repository
public interface CollegeDAO {
	List<College> getList();
	
}
