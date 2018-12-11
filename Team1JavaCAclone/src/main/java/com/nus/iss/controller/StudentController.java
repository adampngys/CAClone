package com.nus.iss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.nus.iss.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@ResponseBody
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		String html = "";
		html += "<ul>";
		/* html += " <li><a href='/testInsert'>Test Insert</a></li>"; */
		html += " <li><a href='/showAllStudents'>Show All Students</a></li>";
		/*
		 * html += " <li><a href='/showFullNameLikeTom'>Show All 'Tom'</a></li>"; 
		 * html += " <li><a href='/deleteAllEmployee'>Delete All Employee</a></li>";
		 */
		html += "</ul>";
		return html;
	}

	@RequestMapping(value = "/showAllStudents", method = RequestMethod.GET)
	public String showAllStudents() {
		return studentService.showAllStudents();
	}

	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public ModelAndView greeting() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("greeting");		
		mav.addObject("msg", "it finally works!");
		return mav;
	}

}
