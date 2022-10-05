package test3;

import java.util.Scanner;

public class FindLargeNo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number::");
		int x=s.nextInt();
		System.out.println("Enter second number::");
	    int y=s.nextInt();
	    System.out.println("enter third number::");
	    int z=s.nextInt();
	    if(x>y && x>z){
	    	System.out.println(x+" is greater number than "+y+" and "+z);
	    	
	    }else if(y>x && y>z){
	    System.out.println(y+" is greater number than "+x+" and "+z);	
	    }else{
	    	System.out.println(z+" is large");
	    }

	}

}
