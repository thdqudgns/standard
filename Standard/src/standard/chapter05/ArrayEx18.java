package standard.chapter05;

public class ArrayEx18 {
	public static void main(String[] args) {
		
		//2차원 배열, []가 하나 더 들어갈 뿐이다
		
		int[][] score = {	//이렇게 작성하면 가독성이 좋다
							{100,100,100}
						,	{20,20,20}
						,	{30,30,30}
						,	{40,40,40}
					};
		
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {	//score[i]로 각 행마다의 배열 수를 센다 
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
			}
		}
		
		for (int[] tmp : score) {	//score의 각 요소(1차원 배열 주소)를 tmp에 저장
			for (int i : tmp) {		//tmp는 1차원 배열을 가리키는 참조변수
				sum += i;
			}
		}
		
		System.out.println("sum="+sum);
	} //main
	
	/*
		score[0][0]=100
		score[0][1]=100
		score[0][2]=100
		score[1][0]=20
		score[1][1]=20
		score[1][2]=20
		score[2][0]=30
		score[2][1]=30
		score[2][2]=30
		score[3][0]=40
		score[3][1]=40
		score[3][2]=40
		sum=570
	*/
	
} //class
