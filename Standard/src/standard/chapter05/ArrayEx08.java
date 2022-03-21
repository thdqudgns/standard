package standard.chapter05;

public class ArrayEx08 {
	public static void main(String[] args) {
		
		//배열 내부의 값들 섞기2, Math.random() 이용 
		
		int[] ball = new int[45]; //45개의 정수값을 저장하기 위한 배열 생성
		
		//배열의 각 요소에 1~45의 값을 저장한다.
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;	//ball[0]에 1이 저장된다
		}
		
		int temp = 0;	// 두 값을 바꾸는데 사용할 임시변수
		int j = 0;		// 임의의 값을 얻어서 저장할 변수
		
		//배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
		//0번째부터 5번째 요소까지 6개만 바꾼다
		for (int i = 0; i < 6; i++) {
			j = (int)(Math.random()*45);	//0~44 범위의 임의의 값을 얻는다
			temp = ball[i];		//i번째 요소의 값을 temp에 저장 (0~5)
			ball[i] = ball[j];	//랜덤(j)번째 요소의 값을 i번째 요소에 저장
			ball[j] = temp;		//기존의 i번째 요소의 값을 랜덤(j)번째 요소에 저장 
		}	//i(0~5)번째와 j(랜덤)번째의 수가 바뀐다.
		
		//배열 ball의 앞에서 부터 6개의 요소를 출력한다
		for (int i = 0; i < 6; i++) {
			System.out.printf("ball[%d]=%d%n", i, ball[i]);	//0~5번째 요소에 새로 저장된 숫자가 출력된다
		}
	} //main
	
	/*
			ball[0]=6
			ball[1]=7
			ball[2]=1
			ball[3]=2
			ball[4]=34
			ball[5]=25
	*/
} //class
