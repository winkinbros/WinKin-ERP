package com.winkin.erp.controller.core;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.winkin.erp.SingleTon;

@Controller("/")
@RequestMapping()
public class DefaultController {


    @GetMapping(value = {""})
    public ModelAndView signinPage(HttpSession httpSession, Model model) {

    	if(httpSession.getAttribute(SingleTon.SESSION_USER_ID) == null ) {
            return new ModelAndView("redirect:auth/signin");

    	}
    	
    	

        return new ModelAndView(SingleTon.PAGE_DASHBOARD);
    }

	
	
	
}
