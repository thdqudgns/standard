package standard.chapter05;

import java.util.Scanner;

public class MultiArrEx04 {
	public static void main(String[] args) {
		
		//다차원 배열의 활용 - 단어 맞추기
		
		String[][] words = {
				{"chair", "의자"},			// words[0][0], words[0][1]
				{"computer", "컴퓨터"},		// words[1][0], words[1][1]
				{"integer", "정수"}			// words[2][0], words[2][1]
		};
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);	//chair, computer, integer
			
			String tmp = scanner.nextLine();
			
			if(tmp.equals(words[i][1])) {	//의자, 컴퓨터, 정수
				System.out.printf("정답입니다.%n%n");
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n", words[i][1]);
			}
		} //for
		
	} //main
	
	/*
	Q1. chair의 뜻은? 몰라
	틀렸습니다. 정답은 의자입니다.

	Q2. computer의 뜻은? 컴퓨터	// -> 띄어쓰기 해서 틀림
	틀렸습니다. 정답은 컴퓨터입니다.

	Q3. integer의 뜻은?정수
	정답입니다.
	*/
	
} //class
