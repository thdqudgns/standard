package standard.chapter04;

import java.util.Scanner;

public class FlowEx28 {
	public static void main(String[] args) {
		
		//do-while문, 최소한 한 번은 수행될 것을 보장한다, 1~100 사이의 숫자 맞추기
		
		int input = 0, answer = 0;
		
		answer = (int)(Math.random()*100) + 1;	//1~100사이의 임의의 수를 저장
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1과 100 사이의 정수를 입력하세요.>");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			} else if(input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
		} while(input!=answer); //조건식 뒤에 ; 을 붙여야 한다
		
		System.out.println("정답입니다.");
		
	}//main
	
	/*
	1과 100 사이의 정수를 입력하세요.>100
	더 작은 수로 다시 시도해보세요.
	1과 100 사이의 정수를 입력하세요.>50
	더 작은 수로 다시 시도해보세요.
	1과 100 사이의 정수를 입력하세요.>25
	더 큰 수로 다시 시도해보세요.
	1과 100 사이의 정수를 입력하세요.>40
	더 큰 수로 다시 시도해보세요.
	1과 100 사이의 정수를 입력하세요.>45
	더 큰 수로 다시 시도해보세요.
	1과 100 사이의 정수를 입력하세요.>46
	더 큰 수로 다시 시도해보세요.
	1과 100 사이의 정수를 입력하세요.>48
	더 큰 수로 다시 시도해보세요.
	1과 100 사이의 정수를 입력하세요.>49
	정답입니다.
	*/

}//class
