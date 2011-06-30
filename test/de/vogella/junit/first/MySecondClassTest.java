package de.vogella.junit.first;

import static org.junit.Assert.assertEquals;


public class MySecondClassTest {
	
	public void testcalculate(){
	MySecondClass tester = new MySecondClass();
	assertEquals("Result", 2, tester.calculate(2, 2));
}
}
