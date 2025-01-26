package in.himanshu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MessageController {

	@GetMapping("/welcome")
	@ResponseBody
	public String getWelcome() {
		String msg="welcome to ashok it";
		
		int i=10/0;
		return msg;
	}
	
	@GetMapping("/greet")
	@ResponseBody
	public String GreetMsg() {
		String msg="Good evening";
		return msg;
	}
	
	
	
}
