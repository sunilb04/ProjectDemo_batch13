package task;

public class Starpattern2 {
	

	public static void main(String[] args) {
		
       int a=11;
       int b=0;
       
       for(int i=2;i<=a-1;i++){
    	   if(a%i==0){
    		   b=b+1;
    	   }
       }
       if(b==0){
    	   System.out.println("number is prime");
       }else{
    	   System.out.println(" not prime");
       }
	}

}
