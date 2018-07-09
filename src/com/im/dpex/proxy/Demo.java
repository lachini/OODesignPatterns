package com.im.dpex.proxy;

import java.lang.reflect.Proxy;

public class Demo {

	public static void main(String[] args) {
		Animal realSubject = new Lion();
		Animal proxy = (Animal) Proxy.newProxyInstance(realSubject.getClass()
				.getClassLoader(), realSubject.getClass().getInterfaces(),
				new AnimalInvocationHandler(realSubject));
		proxy.getSound();
	}
}
