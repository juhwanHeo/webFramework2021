package com.spring.mvc.meet13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller 
@RequestMapping(value = "/meet13/std")
public class StudentController {
	
	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

	@Autowired
	private StdDB stddb;
	
	@RequestMapping(value = "/std1.do", method = RequestMethod.GET)
	public String eprocess1(Model model) {
		model.addAttribute("msg", new Student());
		return "meet13/std/stdinput";
	}
	
	@RequestMapping(value = "/std2.do", method = RequestMethod.GET)
	public ModelAndView eprocess2() {
		ModelAndView mav = new ModelAndView("smeet13/std/tdinput", "msg", new Student());
		return mav;
	}
	
	@RequestMapping(value = "/stdinput.do", method = RequestMethod.POST)
	public String eprocess3(
			@ModelAttribute Student student,
			Model model) {
		logger.info("[student] : " + student);
		
		stddb.create(student);
		
		model.addAttribute("msg", student);
		return "meet13/std/result";
	}
	
}
