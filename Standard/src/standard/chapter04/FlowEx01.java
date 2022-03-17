package standard.chapter04;

public class FlowEx01 {
	public static void main(String[] args) {
		
		//if문, 조건식이 참일 때 괄호 안의 코드가 수행된다
		
		int x = 0;
		System.out.printf("x=%d 일 때, 참인 것은%n", x);
		
		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");
		
		x = 1;
		System.out.printf("x=%d 일 때, 참인 것은%n", x);
		
		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");
		
		/*
		 * x=0 일 때, 참인 것은
		 * x==0
		 * !(x!=0)
		 * x=1 일 때, 참인 것은
		 * x!=0
		 * !(x==0)
		 */
		
	}//main

}//class
