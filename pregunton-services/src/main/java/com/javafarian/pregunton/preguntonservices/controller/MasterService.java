package com.javafarian.pregunton.preguntonservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/master")
public class MasterService {

	@GetMapping("/getMaster")
	public String getMaster() {
		return "yes";
	}

}