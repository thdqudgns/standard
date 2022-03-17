package standard.chapter04;

import java.util.Scanner;

public class FlowEx03 {
	public static void main(String[] args) {
		
		//if-else문, 조건식의 결과가 거짓일 때 else블럭의 문장을 수행한다
		
		System.out.print("숫자를 하나 입력하세요.>");
		Scanner scanner = new Scanner(System.in);	// 스캐너 객체와 System.in input스트림을 통해 입력받을 준비 완료
		int input = scanner.nextInt();				// 화면을 통해 입력받은 숫자를 input에 저장
		
		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다.");
		} else { // input!=0 인 경우
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		}

	}//main

}//class
