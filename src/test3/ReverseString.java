package test3;

public class ReverseString {

	public static void main(String[] args) {
		String s="Bug Spotter";
		int a=s.length();
		for(int i=a-1;i>=0;i--){
			char c=s.charAt(i);
			System.out.print(c);
		}

	}

}
