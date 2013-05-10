package com.creativa.springapp.web.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import com.creativa.springapp.web.HelloController;

public class HelloControllerTest {

	@Test
	public void testHandleRequestView() throws Exception {
		HelloController controller = new HelloController();
		ModelAndView modelAndView = controller.handleRequest();
		assertEquals("hello.jsp", modelAndView.getView());
	}

}
