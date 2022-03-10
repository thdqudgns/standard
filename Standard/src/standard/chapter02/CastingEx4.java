package standard.chapter02;

public class CastingEx4 {
	public static void main(String[] args) {
	
		//정수형과 실수형 간의 형변환
		int i = 91234567;		//8자리의 10진수
		float f = (float)i;		//int를 float로 형변환
		int i2 = (int)f;		//float를 다시 int로 형변환
		
		double d = (double)i;	//int를 double로 형변환
		int i3 = (int)d;		//double을 다시 int로 형변환
		
		float f2 = 1.666f;
		int i4 = (int)f2;
		
		System.out.printf("i=%d\n", i); //i=91234567
		System.out.printf("f=%f i2=%d\n", f, i2); //f=91234568.000000 i2=91234568 -> 정밀도 때문에 값이 변함.
		System.out.printf("d=%f i3=%d\n", d, i3); //d=91234567.000000 i3=91234567
		System.out.printf("(int)%f=%d\n", f2, i4); //(int)1.666000=1
	}

}
