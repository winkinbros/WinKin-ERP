package com.winkin.erp.controller.core;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller("auth")
@RequestMapping("/auth")
public class AuthController {



    @GetMapping(value = {"/signin"})
    public ModelAndView signinPage(HttpSession httpSession, Model model) {
    	
    	

        return new ModelAndView("login");
    }




}
