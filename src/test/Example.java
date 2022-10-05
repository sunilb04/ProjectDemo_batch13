package test;

public class Example {
	public static void main(String[] args){
		char c='e';
		switch(c){
		case 'a':	
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(c+":is vowel");
			break;
		default :
			System.out.println(c+": is consonant");
		}	
	}

}
