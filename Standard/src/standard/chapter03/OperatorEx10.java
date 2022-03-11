package standard.chapter03;

public class OperatorEx10 {
	public static void main(String args[]) {
		
		//같은 의미의 식이라도 오버플로우 때문에 연산의 순서에 따라 다른 결과를 얻을 수 있다
		
		int a = 1000000;
		
		int result1 = a * a / a;
		int result2 = a / a * a;
		
		System.out.printf("%d * %d / %d = %d%n", a, a, a, result1);	//1000000 * 1000000 / 1000000 = -727
		System.out.printf("%d / %d * %d = %d%n", a, a, a, result2);	//1000000 / 1000000 * 1000000 = 1000000
		
		//result1의 경우 백만과 백만을 곱했을 때 int형의 범위를 넘어서 오버플로우가 발생하기 때문에 예상과 다른 결과가 나온다
		
	} //main method

} //class
