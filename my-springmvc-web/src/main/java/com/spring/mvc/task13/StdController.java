package com.spring.mvc.task13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller 
@RequestMapping(value = "/task13/std")
public class StdController {
	
	private static final Logger logger = LoggerFactory.getLogger(StdController.class);
	
	@RequestMapping(value = "/std1.do", method = RequestMethod.GET)
	public String eprocess1(Model model) {
		model.addAttribute("msg", new Student());
		return "task13/std/stdinput";
	}
	
	@RequestMapping(value = "/std2.do", method = RequestMethod.GET)
	public ModelAndView eprocess2() {
		ModelAndView mav = new ModelAndView("/task13/std/stdinput", "msg", new Student());
		return mav;
	}
	
	@RequestMapping(value = "/stdinput.do", method = RequestMethod.POST)
	public String eprocess3(
			@ModelAttribute Student student,
			Model model
			) {
		logger.info("[student] : " + student);
		model.addAttribute("msg", student);
		return "/task13/std/result";
	}
	
}
