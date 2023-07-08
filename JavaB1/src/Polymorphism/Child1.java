package Polymorphism;

public class Child1 extends Parent1{

	public void m1()
	{
		System.out.println("Non static m1 method from child class");
	}
	
	public static void main(String[] args) {
		
		
		Parent1 p = new Parent1();
		p.m1();
		
		Child1 c = new Child1();
		c.m1();
		
		Parent1 pp = new Child1();
		pp.m1();
		pp.m2();
		
	}
	
	
}
