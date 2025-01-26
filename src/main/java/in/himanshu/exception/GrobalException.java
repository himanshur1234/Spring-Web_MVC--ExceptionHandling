package in.himanshu.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GrobalException {
	@ExceptionHandler(value=Exception.class)
	public ModelAndView handleExp(Exception ex) {
		
		ModelAndView mav= new ModelAndView();
		mav.setViewName("page");
		return mav;
	}
}
