package test3;

public class StringHandling {

	public static void main(String[] args) {
	//equalIgnoreCase()
		String s="sunil";
		String s1="bobade";
		System.out.println(s.equalsIgnoreCase(s1));
		
	//length() it shows the length of the string character
		int a=s.length();
		System.out.println(a);
		
	//charAt() it retrieves character which is present on the index number
		char c=s.charAt(0);
		System.out.println(c);
		//String x=s.charAt(2); we cannot use String return type for charAt() method
		System.out.println();
		
	//concat() used to merge the string characters
		String s2=s.concat(s1);
		System.out.println(s2);
		String s3="anil ".concat(s1);
		System.out.println(s3);
		String s4="sunil ".concat("bobade");
		System.out.println(s4);
		
		

	}

}
