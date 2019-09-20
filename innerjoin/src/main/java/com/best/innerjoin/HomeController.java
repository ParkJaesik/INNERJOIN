package com.best.innerjoin;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	

	@RequestMapping(value = "home.ij", method = RequestMethod.GET)
	public String home() {
		// HomeController에는 메인페이지로 돌아가는 기능 또는
		// 개인적으로 테스트 하고 싶은 것이 있을 경우 사용하자!
		System.out.println("test");
		return "home";
	}
	
}
