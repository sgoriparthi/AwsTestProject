package com.example.test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.WelcomeController;
import com.example.service.UserService;

public class WelcomeControllerTest {

	private static WelcomeController welcomeController;

	@Autowired  
	private UserService userService;
	//Map<String, Object> model = new HashMap<>();
	//private String message = "Test Hello World";
	
	    @BeforeClass
	    public static void initController() {
	    	welcomeController = new WelcomeController();
	    }
	 
	    @Before
	    public void beforeEachTest() {
	        System.out.println("This is executed before each Test");
	        //model.put("message", this.message);
	    }
	 
	    @After
	    public void afterEachTest() {
	        System.out.println("This is exceuted after each Test");
	    }
	 
	    @Test
	    public void testSum() {
	        int result = welcomeController.sum(1,2);
	        assertEquals(3, result);
	    }

}
