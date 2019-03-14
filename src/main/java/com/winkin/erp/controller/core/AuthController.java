package com.winkin.erp.controller.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.winkin.erp.PJ_USER;
import com.winkin.erp.SingleTon;
import com.winkin.erp.service.UserService;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

@Controller("auth")
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private UserService I_UserService;

	@GetMapping(value = { "/signin" })
	public ModelAndView signinPage(HttpSession httpSession, Model model) {

		return new ModelAndView("login");
	}

	@PostMapping(value = { "/signin" })
	public ModelAndView submitSingin(HttpSession httpSession, Model model, @RequestParam("userid") String userid,
			@RequestParam("password") String password) {

		// Binding Default Input
		model.addAttribute("userid", userid);

		model.addAttribute("password", password);

		// @RequestParam Validation
		if (userid == null || userid.trim().equals("") || password == null || password.trim().equals("")) {

			return new ModelAndView(SingleTon.PAGE_LOGIN);

		}

		PJ_USER O_PJ_USER = I_UserService.getUserById(userid);
		

		// Account Validation
		if (O_PJ_USER == null || O_PJ_USER.getStatusyn().equals("N")) {

			model.addAttribute(SingleTon.ERROR_MSG, "Invalid Userid..!");
			
			return new ModelAndView(SingleTon.PAGE_LOGIN);

		}

		// Account Locked Validation
		if (O_PJ_USER.getLockedyn().equals("Y")) {

			model.addAttribute(SingleTon.ERROR_MSG, "Your Account was locked..!");
			
			return new ModelAndView(SingleTon.PAGE_LOGIN);

		}
		
		//Password Validation
		
		
		
		//Load Session
		httpSession.setAttribute(SingleTon.SESSION_USER_ID, O_PJ_USER.getUserid());
		

		return new ModelAndView("redirect:/");
	}

}
