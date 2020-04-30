package com.pincode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pincode.service.PincodeDataService;

@Controller
public class HomeContoller {

	@Autowired
	PincodeDataService pinCodeDataService;

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("pinCodeList", pinCodeDataService.getAllPincodeList());
		return "home";
	}

}
