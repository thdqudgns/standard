package standard.chapter05;

public class ArrayEx19 {
	public static void main(String[] args) {
		
		//2차원 배열2, 반복문 한 번마다 한 행에서 처리할 것들을 처리한다.
		
		int[][] score = {
							{100,100,100}
							, {20,20,20}
							, {30,30,30}
							, {40,40,40}
							, {50,50,50}
						};
		
		//과목별 총점
		int korTotal = 0, engTotal = 0, mathTotal=0;
		
		System.out.println("번호 국어 영어 수학 총점 평균 ");
		System.out.println("================================");
		
		for (int i = 0; i < score.length; i++) { //0~4, 5번 반복함
			int sum = 0;		//개인별 총점
			float avg = 0.0f;	//개인별 평균
			
			korTotal += score[i][0];	//국어점수 합 - [0]열은 국어점수다
			engTotal += score[i][1];	//영어점수 합 - [1]열은 영어점수다
			mathTotal += score[i][2];	//수학점수 합 - [2]열은 수학점수다
			System.out.printf("%3d", i+1);	//번호 출력, 1~5
			
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];	//i는 행이다. 각 행이 한 사람이므로 한 행에서 열을 바꿔가며 값을 더하여, 개인별 총점을 계산한다
				System.out.printf("%5d", score[i][j]);	//각 행마다의 국어, 영어, 수학 점수를 출력한다
			}
			
			avg = sum/(float)score[i].length;	//개인별(각 행인 i) 평균 계산, 실수 float로. score[i]는 3이다
			System.out.printf("%5d %5.1f%n", sum, avg);	//개인별 총점과 평균을 출력한다
		} //5번 반복
		
		System.out.println("================================");
		System.out.printf("총점:%3d %4d %4d%n", korTotal, engTotal, mathTotal); //과목별 총점 구한다
		
	} //main

	/*
	번호 국어 영어 수학 총점 평균 
	================================
	  1  100  100  100  300 100.0
	  2   20   20   20   60  20.0
	  3   30   30   30   90  30.0
	  4   40   40   40  120  40.0
	  5   50   50   50  150  50.0
	================================
	총점:240  240  240
	*/
	
} //class
