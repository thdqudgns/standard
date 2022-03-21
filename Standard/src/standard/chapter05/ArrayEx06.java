package standard.chapter05;

public class ArrayEx06 {
	public static void main(String[] args) {
		
		//배열을 활용하여 최대, 최소 구하기
		
		int[] score = {79,88,91,33,100,55,95};
		
		int max = score[0];	//배열의 첫번째 값으로 최대값을 초기화한다.
		int min = score[0]; //배열의 첫번째 값으로 최소값을 초기화한다.
		
		for(int i=1; i<score.length;i++) {	//배열의 첫번째 값으로 최대, 최소를 초기화 했으니, 두번째 인덱스 [1]부터 시작한다
			if(score[i] > max) {	//max보다 크다면, max에 저장
				max = score[i];
			} else if(score[i] < min) {	//min보다 작다면, min에 저장
				min = score[i];
			}
		} //end of for
		
		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);

		/*
		최대값 :100
		최소값 :33
		*/
		
	} //main
} //class
