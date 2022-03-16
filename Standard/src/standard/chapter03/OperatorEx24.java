package standard.chapter03;

public class OperatorEx24 {
	public static void main(String args[]) {
		
		//논리연산자 &&, ||, ! 활용
		
		int x = 0; 		//0으로 초기화
		char ch = ' ';	//공백으로 초기화
		
		x = 15;
		System.out.printf("x=%2d, 10 < x && x < 20 =%b%n", x, 10 < x && x < 20); //x=15, 10 < x && x < 20 =true
		//x가 10 초과 20 미만의 수인지 확인한다
		//보통은 변수를 왼쪽에 쓰지만, 가독성 측면에서 변수의 위치를 바꾸는게 나을 수도 있다
		
		x = 6;
		System.out.printf("x=%2d, x%%2==0 || x%%3==0 && x%%6!=0 =%b%n", x, x%2==0 || x%3==0 && x%6!=0); //x= 6, x%2==0 || x%3==0 && x%6!=0 =true
		System.out.printf("x=%2d, (x%%2==0 || x%%3==0) && x%%6!=0 =%b%n", x, (x%2==0 || x%3==0) && x%6!=0); //x= 6, (x%2==0 || x%3==0) && x%6!=0 =false
		//2의 배수 또는 3의 배수지만 6의 배수는 아닌 수를 찾는다 
		//&&가 ||보다 우선순위가 높기 때문에, 괄호()를 하지 않으면 의도하지 않은 결과가 나온다
		//&&와 ||를 같이 사용할 때는 괄호로 우선순위를 명시해주는 것이 낫다
		
		ch='1';
		System.out.printf("ch='%c', '0' <= ch && ch <= '9' =%b%n", ch, '0' <= ch && ch <='9'); //ch='1', '0' <= ch && ch <= '9' =true

		ch='a';
		System.out.printf("ch='%c', 'a' <= ch && ch <= 'z' =%b%n", ch, 'a' <= ch && ch <='z'); //ch='a', 'a' <= ch && ch <= 'z' =true
		
		ch='A';
		System.out.printf("ch='%c', 'A' <= ch && ch <= 'Z' =%b%n", ch, 'A' <= ch && ch <='Z'); //ch='A', 'A' <= ch && ch <= 'Z' =true
		
		ch='q';
		System.out.printf("ch='%c', ch=='q' || ch=='Q' =%b%n", ch, ch=='q' || ch=='Q'); //ch='q', ch=='q' || ch=='Q' =true
		//해당 문자의 범위를 따진다
		
		
	} //main method

} //class
