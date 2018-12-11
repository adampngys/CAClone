package com.nus.iss.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nus.iss.model.CapsUser;
import com.nus.iss.service.UserService;

@Controller
public class CommonController {

	@Autowired
	private UserService userService;
	@Autowired
	private UserSession us;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String logic(Model model) {
		model.addAttribute("user", new CapsUser());
		return "login";
	}

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ModelAndView authenticate(@ModelAttribute CapsUser user, HttpSession session, BindingResult result) {

	
		ModelAndView mav = new ModelAndView("hello");

		CapsUser u1 = userService.authenticate(user.getId(), user.getPassword());
		if(u1!=null) {
			us.setUser(u1);
			mav.addObject("userSession", us);	
		}
		else {
			mav = new ModelAndView("redirect:/login");
		}
		
		return mav;
	}

}
