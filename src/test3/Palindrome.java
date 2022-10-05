package test3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String original;
		String reverse="";
		System.out.println("enter the string/number:::");
		original=s.nextLine();
		int length=original.length();
		for(int i=length-1;i>=0;i--){
			reverse=reverse+original.charAt(i);
		}
			if(original.equals(reverse)){
				System.out.println(original+":palindrome");
			}
			else{
				System.out.println("not palindrome");
			}
			
		}

	}


