package com.DemoProject.lil.landonhotel.web.controller;

import io.micrometer.common.util.StringUtils;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class WelcomeController {

	@GetMapping
	public String showLandingPage() {
		return "landing"; // Return the name of the HTML file (index.html) without extension
	}

	@GetMapping(value = "welcome", produces = MediaType.TEXT_HTML_VALUE)
	@ResponseBody
	public String getWelcome(@RequestParam(value = "name", required = false) String name) {
		String greeting = "Hello ";
		if (StringUtils.isNotBlank(name)) {
			greeting = greeting + name;
		} else {
			greeting = greeting + "World";
		}
		return "<h1>" + greeting + "</h1>";
	}

}