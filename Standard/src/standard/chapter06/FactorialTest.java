package standard.chapter06;

//재귀호출(recursive call), 메서드의 내부에서 메서드 자신을 다시 호출하는 것

//무한반복문이 조건문과 함께 사용되어야 하는 것처럼, 재귀호출도 조건문이 필수적으로 따라다닌다.
//재귀호출을 쓰면 비효율적이더라도 단순하게 바뀔 수 있다 -> 논리적 오류 발생 감소, 수정 용이

class FactorialTest {
	public static void main(String[] args) {
		int result = factorial(4);	
		//factorial 메서드가 static메서드이므로 인스턴스를 생성하지 않고 직접 호출할 수 있다.
		//그리고 같은 클래스 안에 있기 때문에 클래스 이름을 생략하는 것이 가능하다.
		
		System.out.println(result); //24
	} //main
	
	static int factorial(int n) {	//여기서 n이 0이면 무한반복할 것이다. 그래서 유효성 검사를 해줘야 한다.
		int result = 0;
		
		if(n==1) 
			result = 1;	//n이 1이 되면 재귀 끝
		else 
			result = n * factorial(n-1);	//다시 메서드 자신을 호출한다
		
		return result;
	} //factorial
	
	/*
	 * 처음에 n은 1이 아니라 4기 때문에 else문을 수행한다.
	 * result = 4 * factorial(3)
	 * result = 4 * 3 * factorial(2)
	 * result = 4 * 3 * 2 * factorial(1)
	 * result = 4 * 3 * 2 * 1
	 * 
	 */
	
} //class
