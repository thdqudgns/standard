package standard.chapter04;

import java.util.Scanner;

public class FlowEx04 {
	public static void main(String[] args) {
		
		//if-else if문, 처리해야 할 조건식이 여러 개일 때 사용한다
		
		int score = 0;		//점수를 저장하기 위한 변수
		char grade = ' ';	//학점을 저장하기 위한 변수, 공백으로 초기화한다.
		
		System.out.print("점수를 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();	//화면으로 입력받은 숫자를 score에 저장한다
		
		if(score>=90) {				//score가 90 이상이면 A학점
			grade = 'A';
		} else if(score>=80) {		//score가 80 이상이면 B학점
			grade = 'B';
		} else if(score>=70) {		//score가 70 이상이면 C학점
			grade = 'C';
		} else {					//나머지는 D학점
			grade = 'D';
		}
		
		System.out.println("당신의 학점은 " + grade + "입니다.");
		
		
		
	}//main

}//class
