package com.demo.application.application_demo;


import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {
    
	public AppTest(String TestName) {
		super(TestName);
	}
	
	public static TestSuite Suite() {
		return new TestSuite( AppTest.class );
	}
	

 
  
}
