package standard.chapter04;

import java.util.Scanner;

public class FlowEx25 {
	public static void main(String[] args) {
		
		//각 자리 숫자의 합을 구하는 예제
		
		int num = 0, sum = 0;
		System.out.print("숫자를 입력하세요. (예:12345)>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();	//화면을 통해 입력받은 내용을 tmp에 저장
		num = Integer.parseInt(tmp);		//입력받은 문자열(tmp)을 숫자로 변환
		
		while(num!=0) {
			//num을 10으로 나눈 나머지를 sum에 더함
			sum += num%10;	//sum = sum + num%10
			System.out.printf("sum=%3d num=%d%n", sum, num);
			
			num /= 10;	//num = num/10; num을 10으로 나눈 값을 다시 num에 저장
		}
		
		System.out.println("각 자리수의 합:" + sum);
		
	}//main
	
	/*
	숫자를 입력하세요. (예:12345)>987654321
	sum=  1 num=987654321
	sum=  3 num=98765432
	sum=  6 num=9876543
	sum= 10 num=987654
	sum= 15 num=98765
	sum= 21 num=9876
	sum= 28 num=987
	sum= 36 num=98
	sum= 45 num=9
	각 자리수의 합:45
	*/
	
}//class
