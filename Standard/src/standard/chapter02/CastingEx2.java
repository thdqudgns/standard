package standard.chapter02;

public class CastingEx2 {
	public static void main(String[] args) {
	
		//정수형 간의 형변환
		//변환하고자 하는 타입을 괄호와 함께 붙여주기만 하면 된다.
		
		int i = 10;
		byte b = (byte)i; //4byte인 int형을 1byte인 byte형으로 형변환
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b); //[int -> byte] i=10 -> b=10
		
		i = 300;
		b = (byte)i; //4byte인 int형을 1byte인 byte형으로 형변환
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b); //[int -> byte] i=300 -> b=44 : 값손실이 일어남
		
		//작은 데이터에서 큰 데이터로 형변환 할 때는 데이터타입을 적어주지 않아도 자동형변환 된다.
		b = 10;
		i = (int)b; //1byte인 byte형을 4byte인 int형으로 형변환. 
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i); //[byte -> int] b=10 -> i=10
		
		b = -2;
		i = (int)b; //1byte인 byte형을 4byte인 int형으로 형변환
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i); //[byte -> int] b=-2 -> i=-2
		
		System.out.println("i="+Integer.toBinaryString(i)); //i=11111111111111111111111111111110, 2의보수법

	}

}
