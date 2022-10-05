package test;
import java.util.Scanner;
public class Example2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=scn.next();
		
		switch (name){
		case "sunil" :
			System.out.println(name+" is a bug spotter student");
			break ;
		case "Anil" :
			System.out.println(name+" is a bug spotter student");
			break;
		case "Pankaj":
			System.out.println(name+" is a bug spotter student");
			break;
		case "Sandy":
			System.out.println(name+" is a bug spotter student");
			default:
				System.out.println(name+":is not a bug spotter student");
		}

	}

}
