package com.slokam.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
	
	@RequestMapping("getdata")
     public String getdata() {
		
	return "input.jsp" ;
	
}
}
