package com.johnporrasr.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.johnporrasr.constant.ViewConstant;
import com.johnporrasr.model.UserCredential;

@Controller
public class LoginController {
	
	private static final Log LOG = LogFactory.getLog(LoginController.class);

	@GetMapping("/login")
	public String showLoginForm(
			Model model,
			@RequestParam(name="error", required=false) String error,
			@RequestParam(name="logout", required=false) String logout
			)
	{
		LOG.info("METHOD: showLoginForm -- PARAMS: error=" + error + ", logout" + logout);
		model.addAttribute("logout", error);
		model.addAttribute("logout", logout);
		LOG.info("Retorna a la vista login");
		return ViewConstant.LOGIN;
	}
	
	@GetMapping({"/loginsuccess", "/"})
	public String loginCheck()
	{
		LOG.info("METHOD: logincheck()");
		LOG.info("Retorna a la vista contacts");
		return "redirect:/contacts/showcontacts";
			
	}
	
}
