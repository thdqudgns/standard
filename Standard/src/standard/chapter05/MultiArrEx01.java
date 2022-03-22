package standard.chapter05;

import java.util.Scanner;

public class MultiArrEx01 {
	public static void main(String[] args) {
		
		//다차원 배열의 활용 - 좌표에 X표 하기
		
		final int SIZE = 10;	//상수라서 final 붙이고, 대문자로 적음
		int x = 0, y = 0;
		
		char[][] board = new char[SIZE][SIZE];	//board는 10x10 배열이다, char형이라 null로 초기화
		byte[][] shipBoard = {					//shipBoard는 9x9 배열이다, 아래의 표대로 초기화 됨
//				  1  2  3  4  5  6  7  8  9
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 1
				{ 1, 1, 1, 1, 0, 0, 1, 0, 0 }, // 2
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 3
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 4
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 5
				{ 1, 1, 0, 1, 0, 0, 0, 0, 0 }, // 6
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 7
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 8
				{ 0, 0, 0, 0, 0, 1, 1, 1, 0 }, // 9
		};
		
		// 1행에 행번호를, 1열에 열번호를 저장한다
		for (int i = 0; i < SIZE; i++) {	//0~9, 10번 반복
			board[0][i] = board[i][0] = (char)(i+'0');	//0을 [0][0]에 저장, 1을 [0][1]과 [1][0]에 저장, 2를 [0][2]와 [2][0]에 저장, ...
		}
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.printf("좌표를 입력하세요.(종료는 00)>");
			String input = scanner.nextLine();	// 화면입력받은 내용을 input에 저장
			
			if(input.length()==2) {		//두 글자를 입력한 경우
				x = input.charAt(0) - '0';	//문자를 숫자로 변환
				y = input.charAt(1) - '0';
				
				if(x==0 && y==0)	//x와 y가 모두 0인 경우 종료
					break; //이곳을 감싸고 있는 가장 가까운 반복문은 while밖에 없다. while문을 종료시킨다.
			}
			
			if(input.length()!=2 || x<=0 || x>=SIZE || y<=0 || y>=SIZE) {	
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				continue; //2글자를 입력하지 않고, 범위를 벗어난 경우엔 다시 while문 처음으로 돌아감
			}
			
			// shipBoard[x-1][y-1]의 값이 1이면 'O'을, 아니면 'X'를 board[x][y]에 저장한다
			// shipBoard[][]의 값이 1인 곳을 board[][]에서는 'O'로 표현한다
			// shipBoard[][]의 값이 0인 곳을 board[][]에서는 'X'로 표현한다
			board[x][y] = shipBoard[x-1][y-1]==1 ? 'O' : 'X';
			
			//배열 board의 내용을 화면에 출력한다
			for (int i = 0; i < SIZE; i++) {
				System.out.println(board[i]);	//board[i]는 1차원 배열
			}
			System.out.println();
		} //end of while
		
	} //main
	
} //class
