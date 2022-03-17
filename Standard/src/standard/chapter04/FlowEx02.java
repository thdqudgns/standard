package standard.chapter04;

import java.util.Scanner;

public class FlowEx02 {
	public static void main(String[] args) {
		
		//블럭으로 감싸지 않고 여러 줄의 코드를 작성할 경우, 조건식 바로 다음에 오는 하나의 문장만 if문에 속하게 된다
		//블럭{} 내의 문장이 하나뿐인 경우 {}를 생략할 수 있지만, 생략하지 않는게 낫다
		
		int input;
		
		System.out.print("숫자를 하나 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in); //스캐너 객체와 System.in input스트림을 통해 입력받을 준비 완료
		String tmp = scanner.nextLine();	//화면을 통해 입력받은 내용을 tmp에 저장
		input = Integer.parseInt(tmp);		//입력받은 문자열(tmp)을 숫자로 변환
		
		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		
		if(input!=0)	//괄호 없이 작성
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.printf("입력하신 숫자는 %d입니다.", input); //세번째 출력문이 항상 출력된다
		
		
	}//main

}//class
