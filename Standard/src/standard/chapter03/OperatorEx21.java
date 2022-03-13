package standard.chapter03;

public class OperatorEx21 {
	public static void main(String args[]) {
		
		//비교 연산자
		
		System.out.printf("10 == 10.0f \t %b%n", 10==10.0f);	//10 == 10.0f 	 true
		System.out.printf("'0'==0 \t %b%n", '0'==0);			//'0'==0 	 false
		System.out.printf("'A'==65 \t %b%n", 'A'==65);			//'A'==65 	 true
		System.out.printf("'A' > 'B' \t %b%n", 'A' > 'B');		//'A' > 'B' 	 false
		System.out.printf("'A'+1 != 'B' \t %b%n", 'A'+1 != 'B');//'A'+1 != 'B' 	 false
		System.out.printf("'A'+1 == 'B' \t %b%n", 'A'+1 == 'B');	//'A'+1 == 'B' 	 true
		
	} //main method

} //class
