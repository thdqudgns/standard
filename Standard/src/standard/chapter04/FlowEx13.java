package standard.chapter04;

public class FlowEx13 {
	public static void main(String[] args) {
		
		//for문에서 합계가 돌아가는 과정 확인하기
		
		int sum = 0;	//합계를 저장하기 위한 변수
		
		for(int i=1; i<=10; i++) {
			sum += 1; //sum = sum + i;
			System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum);
		}
		
		/*
		 * 1부터  1 까지의 합:  1
		 * 1부터  2 까지의 합:  2
		 * 1부터  3 까지의 합:  3
		 * 1부터  4 까지의 합:  4
		 * 1부터  5 까지의 합:  5
		 * 1부터  6 까지의 합:  6
		 * 1부터  7 까지의 합:  7
		 * 1부터  8 까지의 합:  8
		 * 1부터  9 까지의 합:  9
		 * 1부터 10 까지의 합: 10
		 */
		
	}//main

}//class
