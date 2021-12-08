package com.project.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.CollegeExamDAO;
import com.project.vo.CollegeExam;

@Service
public class CollegeExamService {

	private static final Logger logger = LoggerFactory.getLogger(CollegeExamService.class);

	@Autowired
	private CollegeExamDAO collegeExamDAO;

	
	public CollegeExam get(Map<String, Object> map) {
		CollegeExam exam = null;
		
		try {
			exam = collegeExamDAO.getList(map).get(0);
		} catch (Exception e) {
			exam = new CollegeExam();
			logger.error(e.getMessage());
		}
		
		return exam;
	}
	
	public List<CollegeExam> getList(Map<String, Object> map) {
		List<CollegeExam> list = null;

		try {
			list = collegeExamDAO.getList(map);
		} catch (Exception e) {
			list = new ArrayList<>();
			logger.error(e.getMessage());
		}

		return list;
	}

}
