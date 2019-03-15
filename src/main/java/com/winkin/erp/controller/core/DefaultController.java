package com.winkin.erp.controller.core;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.winkin.erp.SingleTon;
import com.winkin.erp.service.MenuService;

@Controller("/")
@RequestMapping()
public class DefaultController {

	
	@Autowired
	private MenuService A_MenuService;
	
	

    @GetMapping(value = {""})
    public ModelAndView signinPage(HttpSession httpSession, Model model) {

    	if(SingleTon.isNewSession(httpSession) ) {
    		
            return new ModelAndView("redirect:auth/signin");

    	}

    	//Fetching Dash-board Menu List
    	model.addAttribute("menulist",A_MenuService.getMenulist(SingleTon.getSessionData(httpSession)));
    	
        return new ModelAndView(SingleTon.PAGE_DASHBOARD);
    }

	
	
	
}
