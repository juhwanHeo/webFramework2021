package com.project.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.CollegeDAO;
import com.project.vo.College;

@Service
public class CollegeService {

	private static final Logger logger = LoggerFactory.getLogger(CollegeService.class);

	@Autowired
	private CollegeDAO collegeDAO;

	public List<College> getList() {
		List<College> list = null;

		try {
			list = collegeDAO.getList();
		} catch (Exception e) {
			list = new ArrayList<>();
			logger.error(e.getMessage());
		}

		return list;
	}

}
