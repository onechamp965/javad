package sec02.exam05;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		interfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		interfaceB ib = impl;
		ia.methodA();
		System.out.println();
		
		interfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}