package com.bit.test;

public class Riverse {
	public static void main(String[] args) {
		String r= reverse ("umbrella");
		System.out.println(r);
	}
	public static String reverse(String s) {
		char[] letters= new char[s.length()];
		for(int i=s.length()-1; i<0; i--) {
		System.out.println(s.charAt(i));
	}
return s;
}
}