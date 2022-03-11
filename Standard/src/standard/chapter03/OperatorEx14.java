package standard.chapter03;

public class OperatorEx14 {
	public static void main(String args[]) {
		
		//문자의 코드값을 이용한 코드값 증가에 따른 문자변화 확인
		
		char c = 'a';
		for(int i=0; i<26 ; i++) {		//{}안의 문장을 26번 반복한다
			System.out.print(c++);	//'a'부터 26개의 문자를 출력한다
		}
		System.out.println();	//줄바꿈
		
		c = 'A';
		for(int i=0; i<26 ; i++) {		//{}안의 문장을 26번 반복한다
			System.out.print(c++);	//'A'부터 26개의 문자를 출력한다
		}
		System.out.println();	//줄바꿈
		
		c = '0';
		for(int i=0; i<10 ; i++) {		//{}안의 문장을 10번 반복한다
			System.out.print(c++);	//'0'부터 10개의 문자를 출력한다
		}
		System.out.println();	//줄바꿈
		
		//결과:
		//abcdefghijklmnopqrstuvwxyz
		//ABCDEFGHIJKLMNOPQRSTUVWXYZ
		//0123456789

		
	} //main method

} //class
