package standard.chapter03;

public class OperatorEx05 {
	public static void main(String args[]) {
		
		//사칙연산자 + - * /
		
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d%n", a, b, a+b);	//10 + 4 = 14
		System.out.printf("%d - %d = %d%n", a, b, a-b);	//10 - 4 = 6
		System.out.printf("%d * %d = %d%n", a, b, a*b);	//10 * 4 = 40
		System.out.printf("%d / %d = %d%n", a, b, a/b);	//10 / 4 = 2 -> int형이라 소수점 이하는 버려진다
		System.out.printf("%d / %f = %f%n", a, (float)b, a/(float)b);	//10 / 4.000000 = 2.500000
		
	} //main method

} //class
