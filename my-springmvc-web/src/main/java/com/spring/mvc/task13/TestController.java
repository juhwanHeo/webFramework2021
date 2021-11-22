package com.spring.mvc.task13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller 
@RequestMapping(value = "/task13/test")
public class TestController {
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping(value = "/t1.do", method = RequestMethod.GET)
	public String myTitle(Model model) {
		model.addAttribute("cmd", new TestModel("t1"));
		return "task13/test/t1";
	}
	
	@RequestMapping(value = "/testmodelandview.do", method = RequestMethod.GET)
	public ModelAndView myTitle() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("cmd", new TestModel("testmodelandview"));
		mav.setViewName("task13/test/testmodelandview");
		return mav;
	}
	
	@RequestMapping(value = "/myvoid", method = RequestMethod.GET)
	public void mine(Model model) {
		model.addAttribute("cmd", new TestModel("myvoid"));
	}
	
	@RequestMapping(value = "/mymodel", method = RequestMethod.GET)
	public TestModel myModel() {
		return new TestModel("mymodel");
	}
	
	@ResponseBody
	@RequestMapping(value = "/mybody2", method = RequestMethod.GET)
	public ResponseEntity<String> myBody2() {
		HttpHeaders h = new HttpHeaders();
		h.add("Content-Type", "text/html; charset=UTF-8");
		
		String html = "<h1>TestTestTest....지금은 테스트중임</h1>";
		return new ResponseEntity<String>(html, h, HttpStatus.OK);
	}
	
}
