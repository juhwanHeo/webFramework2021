package com.spring.mvc;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller 
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/test.do", method = RequestMethod.POST)
	public String home(Locale locale, Model model
					,@RequestParam("id") String id) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		model.addAttribute("id", id);
		
		return "home";
	}
	
	@RequestMapping(value = "/einput.do", method = RequestMethod.GET)
	public String einput(Locale locale, Model model) {
		return "einput";
	}
	
}
