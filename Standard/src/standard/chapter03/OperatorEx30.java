package standard.chapter03;

public class OperatorEx30 {
	
	//쉬프트 연산자 <<, >>
	
	//쉬프트 연산자를 사용하는 것이 나눗셈, 곱셈보다 빠르다
	//그러나 코드의 가독성이 저해되므로 잘 사용하지 않는다
	//보다 빠른 실행속도가 요구되어지는 곳만 쉬프트 연산자를 사용하는 것이 좋다
	
	//10진 정수를 2진수로 변환하는 메서드
	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
	}
	
	public static void main(String args[]) {
		
		int dec = 8;
		
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 1, dec >> 1, toBinaryString(dec >> 1));
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 2, dec >> 2, toBinaryString(dec >> 2));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 0, dec << 0, toBinaryString(dec << 0));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 1, dec << 1, toBinaryString(dec << 1));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 2, dec << 2, toBinaryString(dec << 2));
		System.out.println();
		
		dec = -8;
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 1, dec >> 1, toBinaryString(dec >> 1));
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 2, dec >> 2, toBinaryString(dec >> 2));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 0, dec << 0, toBinaryString(dec << 0));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 1, dec << 1, toBinaryString(dec << 1));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 2, dec << 2, toBinaryString(dec << 2));
		System.out.println();
		
		dec = 8;
		System.out.printf("%d >> %2d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
		System.out.printf("%d >> %2d = %4d \t%s%n", dec,32, dec >> 32, toBinaryString(dec >> 32));
		
		/*
		 * 8 >> 0 =    8 	00000000000000000000000000001000, 그대로
		 * 8 >> 1 =    4 	00000000000000000000000000000100, 우측 1칸 이동
		 * 8 >> 2 =    2 	00000000000000000000000000000010, 우측 2칸 이동
		 * 8 << 0 =    8 	00000000000000000000000000001000, 그대로
		 * 8 << 1 =   16 	00000000000000000000000000010000, 좌측 1칸 이동
		 * 8 << 2 =   32 	00000000000000000000000000100000, 좌측 2칸 이동
		 * 
		 * -8 >> 0 =   -8 	11111111111111111111111111111000, 그대로
		 * -8 >> 1 =   -4 	11111111111111111111111111111100, 우측 1칸 이동, 음수라서 좌측에 1이 새로 땡겨진다
		 * -8 >> 2 =   -2 	11111111111111111111111111111110, 우측 2칸 이동, 음수라서 좌측에 1이 새로 땡겨진다
		 * -8 << 0 =   -8 	11111111111111111111111111111000, 그대로
		 * -8 << 1 =  -16 	11111111111111111111111111110000, 좌측 1칸 이동, 우측에 0이 새로 당겨진다
		 * -8 << 2 =  -32 	11111111111111111111111111100000, 좌측 2칸 이동, 우측에 0이 새로 당겨진다 
		 * 
		 * 8 >>  0 =    8 	00000000000000000000000000001000, 그대로
		 * 8 >> 32 =    8 	00000000000000000000000000001000, 그대로(제자리로 돌아오기 때문에 아무것도 하지 않음)

		 */
		
	} //main method

} //class
