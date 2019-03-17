package com.winkin.erp.controller.notes;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.winkin.erp.SingleTon;
import com.winkin.erp.pojo.PJ_NOTES;
import com.winkin.erp.service.UserService;

@Controller("notes")
@RequestMapping("/app/notes")
public class NotesController {

	@Autowired
	private UserService I_UserService;

	@GetMapping(value = { "","/" })
	public ModelAndView post_add(HttpSession httpSession, Model model) {

		if (SingleTon.isNewSession(httpSession)) {

			return new ModelAndView("redirect:auth/signin");

		}

		model.addAttribute("test","STRING TEXT");
		
		
		return new ModelAndView(SingleTon.PAGE_NOTES_HOME);

	}
	
	
	

}
