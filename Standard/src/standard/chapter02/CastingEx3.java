package standard.chapter02;

public class CastingEx3 {
	public static void main(String[] args) {
		
		//실수형 간의 형변환
		//변환하고자 하는 타입을 괄호와 함께 붙여주기만 하면 된다.
		float f = 9.1234567f;
		double d = 9.1234567;
		double d2 = (double)f; //4byte인 float형을 8byte인 double형으로 형변환
		//작은 데이터에서 큰 데이터로 형변환 할 때는 데이터타입을 적어주지 않아도 자동형변환 된다.
		
		System.out.printf("f =%20.18f\n", f); //f =9.123456954956055000
		System.out.printf("d =%20.18f\n", d); //d =9.123456700000000000
		System.out.printf("d2 =%20.18f\n", d2); //d2 =9.123456954956055000
		//d를 보면 정밀도가 소수점아래 14자리까지 되기에 7자리 이후를 0으로 저장했다.
		//f는 정밀도가 소수점아래 6자리까지 되기에 7자리 이후로는 막 저장된다.
		//막 저장된 상태를 double로 형변환해도 저장된 것은 그대로라서 f와 d2의 값이 똑같게 나온다.
	}

}
