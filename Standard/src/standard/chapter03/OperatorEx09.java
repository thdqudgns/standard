package standard.chapter03;

public class OperatorEx09 {
	public static void main(String args[]) {
		
		//연산 시 자료형의 범위를 넘어 오버플로우가 발생
		
		long a = 1_000_000 * 1_000_000;
		long b = 1_000_000 * 1_000_000L;
		
		System.out.println("a=" + a);	//a=-727379968
		System.out.println("b=" + b);	//b=1000000000000
		
		//a를 보면 int형과 int형의 연산결과는 int형인데
		//연산결과가 int형의 최대값인 2x10^9를 넘으므로 오버플로우가 발생했다
		//이미 오버플로우가 발생한 값을 아무리 long형으로 저장을 해도 소용이 없다
		
		//b는 int형과 long형의 연산이기 때문에 그 결과가 long형이다. 올바른 결과가 나온다
		
	} //main method

} //class
