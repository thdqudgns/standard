package standard.chapter03;

public class OperatorEx16 {
	public static void main(String args[]) {
		
		//원하는 소숫점까지 나오게 하는 방법
		//수를 곱하면서 int형으로 바꿨다가 float형으로 다시 나눈다.
		
		float pi = 3.141592f;
		float shortPi = (int)(pi * 1000) / 1000f;
		System.out.println(shortPi);	//3.141
		
	} //main method

} //class
