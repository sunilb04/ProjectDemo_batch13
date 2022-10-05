package test;

public class LeapYear {
	
	public void m1(){
		
		for(int year=2000;year<=2022;year++){
			if(year%4==0){
				System.out.println(year+": was leap year..");
				
			}/*else{
				System.out.println(year+" not leap year");
			}*/
		}
	}

	public static void main(String[] args) {
		LeapYear lp=new LeapYear();
		lp.m1();

	}

}
