package test2;

public class StarPattern {
	public static void main(String[] args){
		for(int i=1;i<=7;i++){
			for(int a=1;a<=i;a++){
				System.out.print(" ");
				
			}
			for(int b=7;b>=i;b--){
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int x=1;x<=7;x++){
			for(int y=7;y>=x;y--){
				System.out.print(" ");
				
			}
			for(int z=1;z<=x;z++){
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
