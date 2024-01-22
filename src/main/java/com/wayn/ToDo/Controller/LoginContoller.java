package com.wayn.ToDo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginContoller {
	
	@RequestMapping(value = "login" , method = RequestMethod.GET)
	String getLogin() {
		return "login";
	}
	
	@RequestMapping(value = "login" , method = RequestMethod.POST)
	String postLogin(@RequestParam String name,ModelMap model) {
		model.put("name", name);
		return "welcome";
	}
	
	
	

}
