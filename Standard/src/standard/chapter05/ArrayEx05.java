package standard.chapter05;

public class ArrayEx05 {
	public static void main(String[] args) {
		
		//배열을 활용하여 총합과 평균 구하기
		
		int sum = 0;		//총점 저장
		float average = 0f;	//평균 저장
		
		int[] score = {100,88,100,100,90};
		
		for(int i=0;i<score.length;i++) { // 0 ~ 4
			sum += score[i];
		}
		average = sum/(float)score.length;	//계산 결과를 float로 얻기 위해서 형변환
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
		
		/*
		총점 : 478
		평균 : 95.6
		*/
		
	} //main
} //class
