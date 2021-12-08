package com.project.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.project.vo.CollegeExam;

@Repository
public interface CollegeExamDAO {
	List<CollegeExam> getList(Map<String, Object> map);
	
}
