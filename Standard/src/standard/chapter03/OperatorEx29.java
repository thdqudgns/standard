package standard.chapter03;

public class OperatorEx29 {
	public static void main(String args[]) {
		
		//비트 전환 연산자 ~, 피연산자의 1의 보수를 얻는다
		
		byte p = 10;
		byte n = -10;
		
		System.out.printf(" p =%d \t%s%n", p, toBinaryString(p));
		System.out.printf("~p =%d \t%s%n", ~p, toBinaryString(~p));			//1의 보수를 얻는다. 10의 1의 보수는 -11이다.
		System.out.printf("~p+1 =%d \t%s%n", ~p+1, toBinaryString(~p+1));	//1의 보수에 +1하면 원래 수를 음수로 한 것과 같다, -10
		System.out.printf("~~p =%d \t%s%n", ~~p, toBinaryString(~~p));
		System.out.println();
		System.out.printf(" n =%d%n", n);
		System.out.printf("~(n-1)=%d%n", ~(n-1));
		
		/*
		 *  p    =10 	00000000000000000000000000001010
		 *  ~p   =-11 	11111111111111111111111111110101
		 *  ~p+1 =-10 	11111111111111111111111111110110
		 *  ~~p  =10 	00000000000000000000000000001010
		 *   
		 *    n =-10
		 *   ~(n-1)=10
		 */
		
		/*
		 * 양의 정수 p가 있을 때, p에 대한 음의 정수를 얻으려면 '~p+1'을 계산하면 된다
		 * 이 사실을 통해서 -10을 2진수로 어떻게 표현할 수 있는지 알 수 있을 것이다
		 * 
		 * 반대로 음의 정수 n이 있을 때, n에 대한 양의 정수를 얻으려면 '~(n-1)'을 계산하면 된다
		 * 물론 부호연산자 '-'를 사용하면 되므로, 이렇게 복잡하게 변환하지 않는다. 참고로만 알아두자
		 */
		
	} //main method
	
	//10진 정수를 2진수로 변환하는 메서드
	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
	}

} //class
