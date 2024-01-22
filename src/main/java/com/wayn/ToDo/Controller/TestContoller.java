package com.wayn.ToDo.Controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestContoller {
	
	@RequestMapping("todo")
	 public String reply() {
		return "hello";
	}

}
