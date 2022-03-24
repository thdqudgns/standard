package standard.chapter06;

//재귀호출로 x의 n제곱의 합을 구하기

class PowerTest {
	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		long result = 0;
		
		for (int i=1; i<=n; i++) {
			result += power(x,i);	//메서드 호출
		}
		System.out.println(result);	//62
	}
	
	// result = 0 + 2
	// result = 2 + 2*2
	// result = 2 + 2*2 + 2*2*2 + 2*2*2*2 + 2*2*2*2*2
	// 2¹ + 2² + 2³ +..
	// x의 n제곱의 합을 구한다
	
	static long power(int x, int n) {
		if(n==1) return x;
		return x * power(x,n-1);	//재귀 호출, n이 1이 될 때까지
	}
}
