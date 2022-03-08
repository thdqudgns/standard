package standard.chapter02;

public class CharToCode {
	public static void main(String[] args) {
		//문자를 코드로 = 인코딩.
		char ch = 'A';	// A는 정수로 65이다.
		int code = (int)ch;	//ch에 저장된 값을 int형으로 변환하여 저장한다.
		
		System.out.printf("%c=%d(%#X)%n", ch, code, code);
		//%c로 ch를 문자로 출력하고, %d로 code를 10진수로 출력하고, %X로 code를 16진수로 출력한다. 
		
		char hch = '가';
		System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
		//%c로 hch를 문자로 출력하고, %d로 hch를 10진수로 출력하고, %X로 hch를 16진수로 출력한다. 
	}

}
