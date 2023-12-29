package com.ecsfin.oauth2.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/demo")
	public String showSecuredMsg() {
		return "Accessed Securely";
	}
}
