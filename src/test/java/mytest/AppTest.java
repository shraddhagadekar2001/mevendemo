package mytest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest  {
	@Test
	public void testApp() {
		Test1 t = new Test1();
		String expected = "madam";
		String actual = t.palindrome(expected);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testApp1() {
		Test1 t = new Test1();
		String expected = "HeeH";
		String actual = t.palindrome(expected);
		Assertions.assertEquals(expected, actual);
	}


	@Test
	public void testApp2() {
		Test1 t = new Test1();
		String expected = "hiiiiii";
		String actual = t.palindrome(expected);
		Assertions.assertEquals(expected, actual);
	}
}
