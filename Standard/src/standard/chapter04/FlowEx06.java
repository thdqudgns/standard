package standard.chapter04;

import java.util.Scanner;

public class FlowEx06 {
	public static void main(String[] args) {
		
		//switch문, 조건식과 일치하는 case문의 코드를 수행한다

		//switch문의 제약조건
		//1. swith문의 조건식 결과는 정수 또는 문자열이어야 한다
		//2. case문의 값은 정수 상수만 가능하며, 중복되지 않아야 한다
		
		System.out.print("현재 월을 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();	//화면을 통해 입력받은 숫자를 month에 저장
		
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("현재의 계절은 봄입니다.");
				break;
			case 6: case 7: case 8:	// 한 줄에 붙여서 써도 된다
				System.out.println("현재의 계절은 여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println("현재의 계절은 가을입니다.");
				break;
			default:
//			case 12: case 1: case 2:
				System.out.println("현재의 계절은 겨울입니다.");
				
		}
		
		
	}//main

}//class
