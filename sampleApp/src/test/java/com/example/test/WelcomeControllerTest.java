package com.example.test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.example.WelcomeController;

public class WelcomeControllerTest {

	private static WelcomeController welcomeController;
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
	        String result = welcomeController.welcome(new HashMap<>());
	        assertEquals("welcome", result);
	    }

}
