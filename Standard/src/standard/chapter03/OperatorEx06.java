package standard.chapter03;

public class OperatorEx06 {
	public static void main(String args[]) {
		
		//자동 형변환과 명시적 형변환
		//크기가 작은 자료형의 변수를 큰 자료형의 변수에 저장할 때는 자동으로 형변환이 되지만
		//반대로 큰 자료형의 값을 작은 자료형의 변수에 저장하려면 명시적으로 형변환 연산자를 사용해서 변환해주어야 한다.
		
		byte a = 10;
		byte b = 20;
		byte c = a + b; //명시적으로 형변환이 필요해서 에러가 발생한다.
		
		//에러메세지:
		//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//	Type mismatch: cannot convert from int to byte

		//	at standard.chapter03.OperatorEx06.main(OperatorEx06.java:8)
		
		System.out.println(c);
		
	} //main method

} //class
