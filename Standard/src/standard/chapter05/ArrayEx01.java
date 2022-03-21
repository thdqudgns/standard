package standard.chapter05;

public class ArrayEx01 {
	public static void main(String[] args) {
		
		//Array, 배열
		//배열은 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		//각 저장공간이 연속적으로 배치되어 있다
		//배열의 선언은 단지 참조변수를 위한 공간을 만드는 것에 불과하다
		//배열의 생성을 위해서는 연산자 'new'와 함께 배열의 타입과 길이를 지정해 주어야 한다
		//인덱스의 범위는 0 ~ length-1 이다
		//배열을 다룰 때 for문은 거의 필수적이다
		
		int[] score = new int[5];
		int k = 1;
		
		score[0] = 50;
		score[1] = 60;
		score[k+1] = 70;
		score[3] = 80;
		score[4] = 90;
		
		int tmp = score[k+2] + score[4]; //int tmp = score[3] + score[4]
		
		//for문으로 배열의 모든 요소를 출력한다.
		for(int i=0; i < 5; i++) {
			System.out.printf("score[%d]:%d%n", i, score[i]);
		}
		
		System.out.printf("tmp:%d%n", tmp);
		System.out.printf("score[%d]:%d%n", 7, score[7]); //index의 범위를 벗어남
		// java.lang.ArrayIndexOutOfBoundsException 에러 발생
		
	} //main
	
	/*
	score[0]:50
	score[1]:60
	score[2]:70
	score[3]:80
	score[4]:90
	tmp:170
	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 7
		at standard.chapter05.ArrayEx01.main(ArrayEx01.java:31)
	*/
	
} //class
