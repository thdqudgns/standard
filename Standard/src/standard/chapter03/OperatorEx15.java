package standard.chapter03;

public class OperatorEx15 {
	public static void main(String args[]) {
		
		//소문자를 대문자로 변환하는 프로그램
		//대문자와 소문자 간의 코드값 차이는 10진수로 32이다
		
		char lowerCase = 'a';
		char upperCase = (char)(lowerCase - 32);
		System.out.println(upperCase);	//A
		
	} //main method

} //class
