package standard.chapter03;

public class OperatorEx17 {
	public static void main(String args[]) {
		
		//원하는 소수점까지 나오게 할 때, 반올림을 위해서는 0.5를 더해준다
		
		double pi = 3.141592;
		double shortPi = (int)(pi * 1000 + 0.5) / 1000.0;
		
		System.out.println(shortPi);	//3.142
		
	} //main method

} //class
