package com.design.pattern.adaptor;

public class Client {
	public static void main(String[] args) {
		Encoder encoder = new CustomEncoder();
		System.out.println(encoder.encode("testing...."));
	}

}
