package test;

public class Odd_Number {
	
	public void m1(){
		for(int i=150;i>=100;i--){
			if(i%2==1){
				System.out.println(i+":Odd Number");
			}/*else{
				System.out.println(i+": is even number");
			}*/
		}
	}

	public static void main(String[] args) {
		
		Odd_Number odd=new Odd_Number();
		odd.m1();

	}

}
