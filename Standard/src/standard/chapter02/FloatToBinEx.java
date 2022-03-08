package standard.chapter02;

public class FloatToBinEx {
	public static void main(String[] args) {
		//부동소수점의 오차
		float f = 9.1234567f;
		int i = Float.floatToIntBits(f);
		
		System.out.printf("%f%n", f);
		System.out.printf("%X%n", i); //16진수로 출력
	}

}
