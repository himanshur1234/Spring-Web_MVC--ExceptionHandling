package in.himanshu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class demo {
	
	@GetMapping("/demo")
	@ResponseBody
	public String getWelcome() {
		String msg="demo method";
		
		int i=10/0;
		return msg;
	}
}
