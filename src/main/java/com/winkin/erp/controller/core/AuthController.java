package com.winkin.erp.controller.core;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller("auth")
@RequestMapping("/auth")
public class AuthController {

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

		if (userid == null || userid.trim().equals("") || password == null || password.trim().equals("")) {

			return new ModelAndView("login");

		}

		return new ModelAndView("login");
	}

}
