package standard.chapter02;

public class FloatEx1 {
	public static void main(String[] args) {
		
		//실수형의 범위와 정밀도
		float f = 9.12345678901234567890f;
		float f2 = 1.2345678901234567890f;
		double d = 9.12345678901234567890d;
		
		System.out.printf("    123456789012345678901234%n");
		System.out.printf("f : %f%n", f); //f : 9.123457 = 소수점 이하 6째자리까지 출력
		System.out.printf("f : %24.20f%n", f); //9.12345695495605500000
		System.out.printf("f2 : %24.20f%n", f2); //1.23456788063049320000
		System.out.printf("d : %24.20f%n", d); //9.12345678901234600000
		
		//정밀도 때문에 실제값과 다른 것을 볼 수 있다.
		//float의 정밀도는 7자리이고, double의 정밀도는 15자리이다.
		//소수점아래로 계산하면 각각 6자리, 14자리다.
	}

}
