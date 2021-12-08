package com.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.service.CollegeExamService;
import com.project.service.CollegeService;
import com.project.service.StudentService;
import com.project.vo.College;
import com.project.vo.CollegeExam;
import com.project.vo.EntranceGrade;

@Controller
@RequestMapping(value = "/project/college")
public class CollegeProjectController {

	private static final Logger logger = LoggerFactory.getLogger(CollegeProjectController.class);

	@Autowired
	private CollegeService collegeService;

	@Autowired
	private CollegeExamService collegeExamService;
	
	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/list.do")
	public String list(Model model) {
		List<College> list = collegeService.getList();
		logger.info("[list.do] list: " + list);
		model.addAttribute("collegeList", list);
		return "project/college/list";
	}
	
	@RequestMapping(value = "/exam/list.do")
	public String examList(
				Model model
				, @RequestParam(value="college_id", required=true) String college_id) {
		Map<String, Object> map = new HashMap<>();
		map.put("college_id", college_id);
		
		List<CollegeExam> list = collegeExamService.getList(map);
		
		logger.info("[list.do] list: " + list);
		model.addAttribute("collegeExamList", list);
		return "project/college/exam/list";
	}
	
	@RequestMapping(value = "/exam/student/list.do")
	public String examStudentList(
				Model model
				, @RequestParam(value="college_id", required=true) String college_id
				, @RequestParam(value="exam_type", required=true) String exam_type) {
		Map<String, Object> map = new HashMap<>();
		map.put("college_id", college_id);
		map.put("exam_type", exam_type);
		List<EntranceGrade> studentList = studentService.getList(map);
		CollegeExam exam = collegeExamService.get(map);
		
		Map<String, List<EntranceGrade>> studentFilter = studentService.getListFilter(map);
		
		logger.info("[/exam/student/list.do] exam: " + exam);
		model.addAttribute("collegeExam", exam);
		model.addAttribute("examStudentList", studentList);
		model.addAttribute("passList", studentFilter.get("passList"));
		model.addAttribute("failList", studentFilter.get("failList"));
		return "project/college/exam/student/list";
	}

}
