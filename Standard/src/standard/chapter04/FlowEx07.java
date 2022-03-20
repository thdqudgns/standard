package standard.chapter04;

import java.util.Scanner;

public class FlowEx07 {
	public static void main(String[] args) {
		
		//Scanner와 switch문을 이용해 가위바위보 게임 만들기, 가위바위보에 숫자 부여 + Math.random()
		
		//가위바위보에 숫자를 부여하여 이기고, 지고, 비기는 상황을 설정했다
		
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();			//화면을 통해 입력받은 숫자를 user에 저장
		int com = (int)(Math.random()*3) + 1;	//1, 2, 3 중 하나가 com에 저장됨
		
		System.out.println("당신은 " + user + "입니다.");
		System.out.println("컴은 " + com + "입니다.");

		switch(user-com) {
			case 2: case -1:	//가위-바위, 바위-보 = -1, 보-가위 = 2
				System.out.println("당신이 졌습니다.");
				break;
			case 1: case -2:	//바위-가위, 보-바위 = 1, 가위-보 = -2
				System.out.println("당신이 이겼습니다.");
				break;
			case 0:				//비기면 0
				System.out.println("비겼습니다.");
				break;	//마지막 문장이므로 break를 사용할 필요가 없다.
		}
		
		/*
		 * 가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>2
		 * 당신은 2입니다.
		 * 컴은 3입니다.
		 * 당신이 졌습니다.
		 * 
		 */
		
		/* double java.lang.Math.random()
		 * 
		 * 0.0 이상 1.0 미만인 양수인 실수 double형 값을 반환합니다.
		 * 반환되는 값은 해당 범위에서 (약) 균일한 분포를 사용하여 의사 난수로 선택됩니다.
		 * 
		 * 반환값:
		 * 		0.0 이상 1.0 미만의 의사 난수 배율.
		 * 
		 * 참고 항목:
		 * 		Random.next Double()
		 */
		
	}//main

}//class
