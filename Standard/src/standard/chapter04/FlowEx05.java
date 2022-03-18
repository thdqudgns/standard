package standard.chapter04;

import java.util.Scanner;

public class FlowEx05 {
	public static void main(String[] args) {
		
		//if문 안에 if문을 중첩해서 사용할 수도 있다
		int score = 0;		//점수를 저장하기 위한 변수
		char grade = ' ', opt = '0';	//학점을 저장하기 위한 변수, 공백으로 초기화한다.
		
		System.out.print("점수를 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();	//화면으로 입력받은 숫자를 score에 저장한다
		
		System.out.printf("당신의 점수는 %d입니다.%n", score);
		
		if(score>=90) {				//score가 90 이상이면 A학점
			grade = 'A';
			if(score>=98) {			//90점 이상 중에서도 98점 이상은 A+
				opt = '+';
			} else if (score <94) {	//90점 이상 94점 미만은 A-
				opt = '-';
			}
		} else if(score>=80) {		//score가 80 이상이면 B학점
			grade = 'B';
			if(score>=88) {
				opt = '+';
			} else if (score <84) {
				opt = '-';
			}
		} else {					//나머지는 C학점
			grade = 'C';
		}
		
		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
		
		
	}//main

}//class
