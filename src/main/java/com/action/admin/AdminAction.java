package com.action.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")

public class AdminAction {	
	@GetMapping({"/login"})
	public String hello(){
		System.out.println("服务端调用了");
		return "admin/login";
	}
}
			