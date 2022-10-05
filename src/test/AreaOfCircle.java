package test;

public class AreaOfCircle {
	
	public void m1(){
		double pi=3.14;
		int r=20;
		double area=pi*r*r;
		System.out.println("Area of Circle is::"+area);
	}

	public static void main(String[] args) {
		AreaOfCircle ac=new AreaOfCircle();
		ac.m1();

	}

}
