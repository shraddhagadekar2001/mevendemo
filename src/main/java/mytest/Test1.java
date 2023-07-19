package mytest;

public class Test1 {
	public String palindrome(String s) {
		StringBuffer s1 = new StringBuffer(s);
		String str = s1.reverse().toString();
		return str;
	}
}
