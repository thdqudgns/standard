package standard.chapter02;

public class FloatToBinEx {
	public static void main(String[] args) {
		
		//부동소수점의 오차
		float f = 9.1234567f;
		int i = Float.floatToIntBits(f);
		
		System.out.printf("%f%n", f); //9.123457, 소수점7번째 자리에서 반올림되어 정수자리 포함 '정밀도 7자리' 지킴
		System.out.printf("%X%n", i); //4111F9AE, 16진수로 출력
	}

}
