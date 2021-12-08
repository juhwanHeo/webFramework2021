package com.project.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.project.vo.EntranceGrade;

@Repository
public interface StudentDAO {
	List<EntranceGrade> getList(Map<String, Object> map);
	List<EntranceGrade> getPassList(Map<String, Object> map);
	List<EntranceGrade> getFailList(Map<String, Object> map);
	
}
