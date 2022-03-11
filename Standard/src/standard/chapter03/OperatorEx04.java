package standard.chapter03;

public class OperatorEx04 {
	public static void main(String args[]) {
		
		//부호 연산자 +, -
		
		int i = -10;
		i = +i;
		System.out.println(i);	//-10
		
		i = -10;
		i = -i;
		System.out.println(i);	//10
		
		//부호 연산자는 덧셈, 뺄셈과 같은 기호를 쓰지만, 다른 연산자다.
		//피연산자의 개수가 달라서 구별이 가능하다.
		
	} //main method

} //class
