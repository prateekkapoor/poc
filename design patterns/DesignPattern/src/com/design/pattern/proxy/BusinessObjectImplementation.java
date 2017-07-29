package com.design.pattern.proxy;

public class BusinessObjectImplementation extends BusinessObject {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.design.pattern.proxy.BusinessObject#sayHi()
	 */
	@Override
	public void sayHi() {
		System.out.println("Have a nice day!!!");
	}
}
