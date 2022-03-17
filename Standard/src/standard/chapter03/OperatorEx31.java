package standard.chapter03;

public class OperatorEx31 {
	public static void main(String args[]) {

		//쉬프트 연산자와 비트 AND 연산자를 이용해 16진수를 끝에서부터 한 자리씩 뽑아내기
		
		int hex = 0xABCD;
		int mask = 0xF;	//0000 0000 0000 1111
		
		System.out.printf("hex=%X%n", hex);		//hex=ABCD
		System.out.printf("%X%n", hex & mask);	//D, 0xF(0000 0000 0000 1111)과의 AND 연산으로 우측 4bit의 값이 출력된다
		
		hex = hex >> 4;	//0xABCD >> 0xABC
		System.out.printf("%X%n", hex & mask);	//C

		hex = hex >> 4; //0xABC >> 0xAB
		System.out.printf("%X%n", hex & mask);	//B
		
		hex = hex >> 4; //0xAB >> 0xA
		System.out.printf("%X%n", hex & mask);	//A
		
	} //main method

} //class
