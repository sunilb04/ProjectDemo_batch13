package test3;
import java.util.Scanner;

public class PrimeNumber {
	

	public static void main(String[] args) {
		int x=0;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number::");
		 int a=s.nextInt();
		 
		for(int i=2;i<a/2;i++){
			if(a%i==0){
			x++;

			}
		}
		if(x==0 && a!=1){
			System.out.println(a+"::is prime number");
		}else{
			System.out.println(a+"::not a prime number");
		}
	}

}
