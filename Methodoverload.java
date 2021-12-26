package com.example;

class A {
	int a = 10;
	int b = 20;

	public void display() throws Exception {
		System.out.println("we are in display() from class A");
	}
}

class B extends A {
	public void display() {
		System.out.println("we are in display() from class B");
	}
}

public class Methodoverload {
	public static void main(String[] args) throws Exception {
		B b = new B();
		b.display();
		
		A a = new B();
		a.display();

		A a1 = new A();
		a1.display();
		
		//B a2 = new A();  //Type mismatch: cannot convert from A to B
		//a2.display();
	}

}
