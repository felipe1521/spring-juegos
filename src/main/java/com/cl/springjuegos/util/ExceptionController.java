package com.cl.springjuegos.util;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(Excepcion.class)
	public ModelAndView handleException(Excepcion exception, RedirectAttributes redirectAttributes) {

		ModelAndView mav = new ModelAndView();
		mav.addObject("message", exception.getMsg());
		mav.setViewName("error");
		return mav;
	}
}
