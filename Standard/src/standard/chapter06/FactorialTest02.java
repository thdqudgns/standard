package standard.chapter06;

//재귀호출(recursive call), 메서드의 내부에서 메서드 자신을 다시 호출하는 것 +  유효성 검사

class FactorialTest02 {
	static long factorial(int n) {	
		// n이 0이하면 무한반복한다. 20이상이면 long타입의 범위를 넘는다. 
		// 그래서 유효성 검사를 해줘야 한다.
		if(n<=0 || n>=20) return -1;	//-1이 flag 역할을 한다
		if(n<=1) return 1;
		return n * factorial(n-1);
	} //factorial

	public static void main(String[] args) {
		int n = 21;
		long result = 0;
		
		for (int i=1; i<=n; i++) {
			result = factorial(i);
			
			if(result==-1) {	//여기서 flag 역할을 함
				System.out.printf("유효하지 않은 값입니다. (0<n<=20) : %d%n", n);
				break; //for문 종료
			} //if
			
			System.out.printf("%2d!=%20d%n", i, result);
		} //for
		
		/*
		 1!=                   1
		 2!=                   2
		 3!=                   6
		 4!=                  24
		 5!=                 120
		 6!=                 720
		 7!=                5040
		 8!=               40320
		 9!=              362880
		10!=             3628800
		11!=            39916800
		12!=           479001600
		13!=          6227020800
		14!=         87178291200
		15!=       1307674368000
		16!=      20922789888000
		17!=     355687428096000
		18!=    6402373705728000
		19!=  121645100408832000
		유효하지 않은 값입니다. (0<n<=20) : 21
		*/
		
	} //main
	
} //class
