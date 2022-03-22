package standard.chapter05;

import java.util.Scanner;

public class MultiArrEx02 {
	public static void main(String[] args) {
		
		//다차원 배열의 활용 - 빙고
		
		//범위를 적는 곳에 숫자를 입력하는 대신, 상수명 SIZE를 사용함.
		//	-> SIZE의 값을 변화시켜도 동작하도록 코드를 설계했다. 
		final int SIZE = 5;
		int x = 0, y = 0, num = 0;
		
		int[][] bingo = new int[SIZE][SIZE];
		Scanner scanner = new Scanner(System.in);
		
		//배열의 모든 요소를 1부터 SIZE*SIZE까지의 숫자로 초기화
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				bingo[i][j] = i*SIZE + j + 1;	//순서대로 1~25까지의 수로 저장된다
			} //내부 for
		} //외부 for
		
		//배열에 저장된 값을 뒤섞는다
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				x = (int)(Math.random()*SIZE);	//0~4
				y = (int)(Math.random()*SIZE);	//0~4
				
				// bingo[i][j]와 임의로 선택된 값(bingo[x][y]을 바꾼다)
				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			} //내부 for
		} //외무 for
		
		do {
			//섞인 이후의 bingo[][]를 출력
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) 
					System.out.printf("%2d ", bingo[i][j]);
				System.out.println();
			} //for
			
			System.out.println();
			
			System.out.printf("1~%d의 숫자를 입력하세요.(종료:0)>", SIZE*SIZE);
			String tmp = scanner.nextLine();	//화면에서 입력받은 내용을 tmp에 저장
			num = Integer.parseInt(tmp);		//입력받은 문자열(tmp)을 숫자로 변환해서 num에 저장
			
			//입력받은 숫자(num)와 같은 숫자가 저장된 요소([i][j])를 찾아서 0으로 바꿈
			outer:
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					if(bingo[i][j]==num) {
						bingo[i][j] = 0;
						break outer;	//2중 반복문을 벗어난다, 2중 반복문을 나와야 하므로 반복문에 이름을 붙였다.
					} //if
				} //내부 for
			} //outer for
			
		} while(num!=0);
		
		//그렇게 하나씩 숫자를 0으로 바꿔가며 빙고게임을 한다
		
	} //main
	
	/*
	 2 18  7 13  14 
	 19 24 16  3  1 
	  9  5  8  4 20 
	 22 15 25 21  6 
	 23 10 17 12 11 

	 1~25의 숫자를 입력하세요.(종료:0)>3
	  2 18  7 13 14 
	 19 24 16  0  1 
	  9  5  8  4 20 
	 22 15 25 21  6 
	 23 10 17 12 11 

	 1~25의 숫자를 입력하세요.(종료:0)>16
	  2 18  7 13 14 
	 19 24  0  0  1 
	  9  5  8  4 20 
	 22 15 25 21  6 
	 23 10 17 12 11 
	*/
} //class
