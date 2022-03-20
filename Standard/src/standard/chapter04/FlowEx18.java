package standard.chapter04;

public class FlowEx18 {
	public static void main(String[] args) {
		
		//반복문의 중첩으로 구구단 만들기, 안쪽 for문의 모든 반복이 끝나고서야 바깥쪽 for문의 다음 반복으로 넘어간다
		
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%d x %d = %d%n", i, j, i*j);
			}
			System.out.println();
		}
				
				/*
					2 x 1 = 2
					2 x 2 = 4
					2 x 3 = 6
					2 x 4 = 8
					2 x 5 = 10
					2 x 6 = 12
					2 x 7 = 14
					2 x 8 = 16
					2 x 9 = 18
	
					(생략)
	
					9 x 1 = 9
					9 x 2 = 18
					9 x 3 = 27
					9 x 4 = 36
					9 x 5 = 45
					9 x 6 = 54
					9 x 7 = 63
					9 x 8 = 72
					9 x 9 = 81
				*/
		
	}//main

}//class
