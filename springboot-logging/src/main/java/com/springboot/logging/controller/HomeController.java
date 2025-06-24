package com.springboot.logging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

	private Logger logger = LoggerFactory.getLogger(HomeController.class);

	@GetMapping
	public String home(@RequestParam(defaultValue = "default value", required = false) String value) {
		// not recommended

		// System.out.println("API calling : Home");

		logger.info("This is api calling {}", value);
		logger.debug("This is API caling {}", value);
		logger.error("This is API caling {}", value);
		logger.warn("This is API caling {}", value);
		logger.trace("This is API caling {}", value);
		return "This is home API";
	}
}
