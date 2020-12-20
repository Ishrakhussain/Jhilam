package com.bit.test;

public class Practise {
	public static void main(String[] args) {
		
		String s="pagla" ;
		
		StringBuffer sb= new StringBuffer();
		char[] c= s.toCharArray();
		for(int i=0; i<c.length; i++) {
		for(int j=i+1; j<c.length; j++) {
			if(c[i]==c[j]) {
		System.out.println(c[i] + "is duplicate character");
		break;
			}
		}
		}
		
		
		
	}
}
