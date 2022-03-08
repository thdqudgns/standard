package standard.chapter02;

public class PrintfEx1 {
	public static void main(String[] args) {
		
		//printf 활용방법
		String url = "www.codechobo.com";
		
		float f1 = .10f;	//0.10, 1.0e-1
		float f2 = 1e1f;	//10.0, 1.0e1, 1.0e+1
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		//같은 값이라도 다른 형식으로 출력하고 싶을 때 printf를 쓴다.
		
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1); //f1=0.100000, 1.000000e-01, 0.100000
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2); //f2=10.000000, 1.000000e+01, 10.0000
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3); //f3=3140.000000, 3.140000e+03, 3140.00

		System.out.printf("d=%f%n", d); //d=1.234568
		System.out.printf("d=%14.10f%n", d); //전체 14자리 중 소수점 10자리 //d=  1.2345678900
		
		System.out.printf("[12345678901234567890]%n"); //[12345678901234567890]
		System.out.printf("[%s]%n", url); //[www.codechobo.com]
		System.out.printf("[%20s]%n", url); //[   www.codechobo.com]
		System.out.printf("[%-20s]%n", url); //왼쪽 정렬 //[www.codechobo.com   ]
		System.out.printf("[%.8s]%n", url); //왼쪽에서 8글자만 출력 //[www.code]
		
		//실수형 값의 출력에 사용되는 지시자는 '%f', '%e', '%g'가 있는데, '%f'가 주로 쓰이고 '%e'는 지수형태로 출력할 때, '%g'는 값을 간략하게 표현할 때 사용한다.
		//'%f'은 기본적으로 소수점 아래 6자리까지만 출력하기 때문에 소수점 아래 7자리에서 반올림한다.
		//'%전체자리.소수점아래자리f'로 자리수를 지정할 수도 있다.
		
		//'%s'에도 숫자를 추가하면 원하는 만큼의 출력 공간을 확보하거나, 문자열의 일부만 출력할 수 있다.
		//기본적으로 우측 끝에 문자열을 붙이고, '-'를 붙이면 좌측 끝에 붙인다. 그리고 '.'을 붙이면 문자열의 일부만 출력할 수 있다.
	}

}
