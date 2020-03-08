package com.cl.springjuegos.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cl.springjuegos.util.Excepcion;

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
