package standard.chapter02;

public class CastingEx2 {
	public static void main(String[] args) {
	
		//정수형 간의 형변환
		//변환하고자 하는 타입을 괄호와 함께 붙여주기만 하면 된다.
		
		int i = 10;
		byte b = (byte)i;
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);
		
		i = 300;
		b = (byte)i;
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b); //[int -> byte] i=300 -> b=44 : 값손실이 일어남
		
		b = 10;
		i = (int)b;
		System.out.printf("[int -> byte] b=%d -> i=%d%n", b, i);
		
		b = -2;
		i = (int)b;
		System.out.printf("[int -> byte] b=%d -> i=%d%n", b, i);
		
		System.out.println("i="+Integer.toBinaryString(i));
	}

}
