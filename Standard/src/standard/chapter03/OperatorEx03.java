package standard.chapter03;

public class OperatorEx03 {
	public static void main(String args[]) {
		
		//메서드 호출에 증감연산자가 사용된 예
		int i=5, j=5;
		System.out.println(i++);	//5, 증가되기 전 값 출력
		System.out.println(++j);	//6, 증가된 후의 값 출력
		System.out.println("i = " + i + ", j = " + j);	//i = 6, j = 6
		//한 번 더 출력했을 때는 i도 증가되어 6으로 나온다.
		
		//** 식에 두 번 이상 포함된 변수에 증감연산자를 사용하는 것은 피해야 한다.
		
	} //main method

} //class
