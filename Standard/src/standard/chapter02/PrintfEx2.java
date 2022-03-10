package standard.chapter02;

public class PrintfEx2 {
	public static void main(String[] args) {
		
		//printf 활용방법2
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000_000L; //long big = 100000000000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum = 010;	//8진수 10, 10진수로는 8
		int hexNum = 0x10;	//16진수 10, 10진수로는 16
		int binNum = 0b10;	//2진수 10, 10진수로는 2
		
		//지시자 - API에서 java.util.Formatter 클래스를 찾으면 나온다.
		//%n : 줄바꿈
		//%b : 불리언 형식으로 출력
		//%d : 10진 정수 형식으로 출력
		//%o : 8진 정수 형식으로 출력
		//%x, %X : 16진 정수 형식으로 출력
		//%f : 부동소수점 형식으로 출력
		//%e, %E : 지수 표현식의 형식으로 출력
		//%c : 문자로 출력
		//%s : 문자열로 출력
		
		System.out.printf("b=%d%n", b); //b=1 - %d로 b를 10진 형식으로 출력하고, %n으로 줄바꿈
		System.out.printf("s=%d%n", s); //s=2 - %d로 s를 10진 형식으로 출력하고, %n으로 줄바꿈
		System.out.printf("c=%c, %d %n", c, (int)c); //c=A, 65 - %c로 c를 문자로 출력하고, %d로 (int)c를 10진 형식으로 출력하고, %n으로 줄바꿈
		//char 타입의 값을 10진수로 출력하려면, int타입으로 형변환해야 한다.
		
		//출력될 값이 차지할 공간을 숫자로 지정할 수 있다.
		System.out.printf("finger=[%5d]%n", finger); // finger=[   10]
		System.out.printf("finger=[%-5d]%n", finger); // finger=[10   ]
		System.out.printf("finger=[%05d]%n", finger); // finger=[00010]
		
		System.out.printf("big=%d%n", big); //big=100000000000
		System.out.printf("hex=%#x%n", hex); //hex=0xffffffffffffffff - '#'은 접두사(16진수 0x, 8진수 0)
		
		System.out.printf("octNum=%o, %d%n", octNum, octNum); //octNum=10, 8 - 8진수로 한 번, 10진수로 한 번 출력.
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum); //hexNum=10, 16 - 16진수로 한 번, 10진수로 한 번 출력.
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum); //binNum=10, 2 - 2진수로 한 번, 10진수로 한 번 출력.
	}

}
