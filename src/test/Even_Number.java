package test;

public class Even_Number {
	
	public void m1(){
		for(int i=1;i<=100;i++){
			if(i%2==0){
				System.out.println(i+":is even no.");
			}
		}
	}
	public static void main(String[] args){
		
		Even_Number even=new Even_Number();
		even.m1();
		
		
	}

}
