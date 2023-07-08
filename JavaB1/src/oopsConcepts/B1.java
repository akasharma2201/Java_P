package oopsConcepts;

public class B1 extends A1 {

	public B1()
	{
		System.out.println("B1 method");
	}
	
	public static void main(String[] args) {
		
		B1 b = new B1();
		
		b.m1();
		
		System.out.println(b.a);
	}
	
}
