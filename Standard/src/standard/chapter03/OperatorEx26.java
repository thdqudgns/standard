package standard.chapter03;

public class OperatorEx26 {
	public static void main(String args[]) {
		
		//효율적인 연산(short circuit evaluation)검증
		
		int a = 5;
		int b = 0;
		
		System.out.printf("a=%d, b=%d%n", a, b); //a=5, b=0
		System.out.printf("a!=0 || ++b!=0 =%b%n", a!=0 || ++b!=0); //a!=0 || ++b!=0 =true
		System.out.printf("a=%d, b=%d%n", a, b); //a=5, b=0
		System.out.printf("a==0 && ++b!=0 =%b%n", a==0 && ++b!=0); //a==0 && ++b!=0 =false
		System.out.printf("a=%d, b=%d%n", a, b); //a=5, b=0
		
		//왼쪽의 a!=0, a==0만 봐도 true, false인 것을 알 수 있기 때문에 연산이 바로 종료되고, 오른쪽 연산은 하지 않았다
		//그래서 두 번의 논리연산을 했음에도 b의 값은 변하지 않았다
		
	} //main method

} //class
