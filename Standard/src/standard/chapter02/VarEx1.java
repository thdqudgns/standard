package standard.chapter02;

public class VarEx1 {
	public static void main(String[] args) {
		
		//변수의 선언과 초기화
		int year = 10; //변수 year을 선언하고, 10으로 초기화한다.
		int age = 14;
		
		System.out.println(year); //10
		System.out.println(age); //14
		
		year = age + 2000; //변수 age의 값에 2000을 더해서 year에 저장
		age = age +1; //age값 1증가

		System.out.println(year); //2014
		System.out.println(age); //15
	}

}
