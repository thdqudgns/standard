package standard.chapter04;

import java.util.Scanner;

public class FlowEx10 {
	public static void main(String[] args) {
		
		//Scanner와 switch문을 이용해 점수 판별하기, int형 정수로 나누는 걸 이용 + Scanner.nextLine(), Integer.parseInt(String s)
		
		//switch문에서는 조건식을 잘 만들어서 case문의 갯수를 줄이는 것이 중요하다
		//나눗셈을 통해 조건식을 간단하게 했다. 88/10은 8.8이 아니라 8이 된다. 80~89 모두 10으로 나누면 8이 된다
		
		int score = 0;
		char grade = ' ';
		
		System.out.print("당신의 점수를 입력하세요.(1~100)>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		score = Integer.parseInt(tmp);
		
		switch(score/10) {
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			default :
				grade = 'F';
		}	//end of switch
		
		System.out.println("당신의 학점은 " + grade +"입니다.");
		
		/*
		 * 당신의 점수를 입력하세요.(1~100)>88
		 * 당신의 학점은 B입니다.
		 */
		
	}//main

}//class
