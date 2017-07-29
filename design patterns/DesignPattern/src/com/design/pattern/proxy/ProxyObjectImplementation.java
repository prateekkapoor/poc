package com.design.pattern.proxy;

public class ProxyObjectImplementation extends BusinessObject {
	private BusinessObject target;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.design.pattern.proxy.BusinessObject#sayHi()
	 */
	public ProxyObjectImplementation(BusinessObject target) {
		this.target = target;
	}

	@Override
	public void sayHi() {
		System.out.println("About to call Business method");
		target.sayHi();
		System.out.println("Business method called");
	}
}
