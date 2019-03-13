package com.winkin.erp.controller.core;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("/")
@RequestMapping()
public class DefaultController {


    @GetMapping(value = {""})
    public ModelAndView signinPage(HttpSession httpSession, Model model) {

    	if(httpSession.getAttribute("id") == null ) {
            return new ModelAndView("redirect:auth/signin");

    	}
    	
    	

        return new ModelAndView("dashboard");
    }

	
	
	
}
