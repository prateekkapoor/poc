package com.kapoopr.reverse;

public class Reverse {
public static void main(String[] args) {
	StringBuffer a= new StringBuffer("hello worldx");
	int n=a.length();
	int i=0,j=n-1;
	char t;
	for(;i<n/2;i++,j--){
		t=a.charAt(i);
		a.setCharAt(i, a.charAt(j));
		a.setCharAt(j, t);
		
	}
	System.out.println(a);
}
}
