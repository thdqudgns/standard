package standard.chapter03;

public class OperatorEx13 {
	public static void main(String args[]) {
		
		//컴파일러가 미리 계산할 수 있는 경우와 없는 경우
		
		char c1 = 'a';
		
//		char c2 = c1 + 1;	//연산결과가 int형이기에 컴파일 에러 발생!!
		char c3 = 'a' + 1;	//b, 컴파일 에러 없음
		
		System.out.println(c3);
		
		//'a' + 1은 상수간의 연산이기 때문에 컴파일 시에 컴파일러가 계산해서 그 결과로 대체해서 문제가 없다
		//그러나 8번 라인처럼 수식에 변수가 들어 있는 경우에는 컴파일러가 미리 계산을 할 수 없기 때문에 (char)자료형을 명시해주어야 한다
		
		
	} //main method

} //class
