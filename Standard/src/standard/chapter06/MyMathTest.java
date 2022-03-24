package standard.chapter06;

// 메서드, 특정 작업을 수행하는 일련의 문장들을 하나로 묶은 것 + 설명

/*
 * 내부적으로 어떻게 동작하는지 몰라도 사용하는데 아무런 어려움이 없다
 * 
 * 메서드를 사용하는 이유:
 * 	1. 높은 재사용성
 * 	2. 중복된 코드의 제거, 유지보수 쉬움
 * 	3. 프로그램 구조화 - 작업단위별로 나눠서 메소드를 만들면 간단해진다
 * 
 * 메서드의 선언과 구현
 * 	선언부: 메서드가 작업을 수행하기 위해 어떤 값들을 필요로 하고(매개변수), 작업의 결과로 어떤 타입의 값을 반환하는지(반환타입)에 대한 정보를 제공한다
 * 		매개변수: 
 * 			각각의 변수 타입을 적어야 한다. 개수가 많으면 배열이나 참조변수를 사용하면 된다.
 * 		메서드 이름: 
 * 			특정 작업을 수행하므로 동사인 경우가 많다. 기능을 쉽게 알 수 있도록 의미있는 이름을 짓자.
 * 		반환타입: 
 * 			작업수행 결과인 반환값의 타입을 적는다. 없는 경우엔 void를 적는다.
 * 
 * 	구현부: {} 안의 문장들.
 * 		return문: 
 * 			반환타입이 void가 아닌 경우, 'return 반환값;'이 반드시 포함되어야 한다.
 * 			반환값의 타입은 반환타입과 일치하거나 자동형변환이 가능한 것이어야 한다.
 * 			매개변수와 달리, 단 하나의 값만 반환할 수 있다
 * 		지역변수:
 * 			메서드 내에서 선언된 변수들은 메서드 안에서만 사용할 수 있다.
 * 
 *  메서드의 호출
 *  	메서드를 호출할 때, 인자의 개수와 순서는 호출된 메서드에 선언된 매개변수와 일치해야 한다.
 *  	인자의 타입은 매개변수의 타입과 일치하거나 자동 형변환이 가능한 것이어야 한다.
 */

class MyMathTest {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L); //long형으로 적어도, double형으로 자동형변환 된다.
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
		
		/*
		add(5L, 3L) = 8
		subtract(5L, 3L) = 2
		multiply(5L, 3L) = 15
		divide(5L, 3L) = 1.6666666666666667
		*/
		
	}//main
}//calss

class MyMath {
	long add(long a, long b) {
		long result = a+b;
		return result;
		//return a+b;	//위의 두 줄을 한 줄로 간단히 할 수 있다
	}
	long subtract(long a, long b) {return a-b;}
	long multiply(long a, long b) {return a*b;}
	double divide(double a, double b) {return a/b;}
	
}