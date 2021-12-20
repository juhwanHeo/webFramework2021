package com.project.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.StudentDAO;
import com.project.vo.EntranceGrade;

@Service
public class StudentService {

	private static final Logger logger = LoggerFactory.getLogger(StudentService.class);

	@Autowired
	private StudentDAO studentDAO;

	public List<EntranceGrade> getList(Map<String, Object> map) {
		List<EntranceGrade> list = null;
		
		try {
			list = studentDAO.getList(map);
		} catch (Exception e) {
			list = new ArrayList<>();
			logger.error(e.getMessage());
		}
		
		return list;
	}
	
	public Map<String, List<EntranceGrade>> getListFilter(Map<String, Object> map) {
		Map<String, List<EntranceGrade>> result = new HashMap<>();
		
		try {
			List<EntranceGrade> passList = studentDAO.getPassList(map);
			List<EntranceGrade> failList = studentDAO.getFailList(map);
			map.put("entrance_yn", "Y");
			List<EntranceGrade> bujungList = studentDAO.getFailList(map);

			result.put("passList", passList);
			result.put("failList", failList);
			result.put("bujungList", bujungList);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		return result;
	}
	

}
