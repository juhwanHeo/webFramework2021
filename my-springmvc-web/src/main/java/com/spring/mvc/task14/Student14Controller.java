package com.spring.mvc.task14;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller 
@RequestMapping(value = "/task14/std")
public class Student14Controller {
	
	private static final Logger logger = LoggerFactory.getLogger(Student14Controller.class);

	@Autowired
	private Student14DB student14db;
	
	@RequestMapping(value = "/std1.do", method = RequestMethod.GET)
	public String eprocess1(Model model) {
		model.addAttribute("msg", new Student());
		return "task14/std/stdinput";
	}
	
	@RequestMapping(value = "/std2.do", method = RequestMethod.GET)
	public ModelAndView eprocess2() {
		ModelAndView mav = new ModelAndView("task14/std/stdinput", "msg", new Student());
		return mav;
	}
	
	@RequestMapping(value = "/stdinput.do", method = RequestMethod.POST)
	public String eprocess3(
			@ModelAttribute Student student,
			Model model) {
		logger.info("[student] : " + student);
		
		student14db.create(student);
		
		model.addAttribute("msg", student);
		return "task14/std/result";
	}
	
	@RequestMapping(value = "/std_list.do", method = RequestMethod.GET)
	public String getStudent(
			Model model,
			@RequestParam(value="seq", required=false, defaultValue="0") int seq) {
		if (seq == 0) {
			List<Student> list = student14db.select();
			model.addAttribute("std_cmd", list);
			return "task14/std/list";
		}
		else {
			Student student = student14db.select(seq);
			model.addAttribute("msg", student);
			return "task14/std/result";
		}
	}
	
	@RequestMapping(value = "/std_update.do", method = RequestMethod.GET)
	public String update(
			@ModelAttribute Student student,
			Model model) {
		logger.info("[student] : " + student);
		
		student14db.update(student);
		return "redirect:/task14/std/std_list.do";
	}
	
	@RequestMapping(value = "/std_delete.do", method = RequestMethod.GET)
	public String delete(
			@RequestParam(value="seq", required=true) int seq) {
		
		student14db.delete(seq);
		return "redirect:/task14/std/std_list.do";
	}
}
