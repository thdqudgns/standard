package standard.chapter03;

public class OperatorEx18 {
	public static void main(String args[]) {
		
		//round메서드를 이용한 반올림
		//round메서드는 매개변수로 받은 값을 소수점 첫째자리에서  반올림을 하고 그 결과를 정수로 돌려준다
		
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0;
		System.out.println(shortPi);	//3.142
		
	} //main method

} //class
