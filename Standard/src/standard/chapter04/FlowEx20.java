package standard.chapter04;

public class FlowEx20 {
	public static void main(String[] args) {
		
		//2중 반복문을 이용해서 i와 j를 1부터 5까지 1씩 증가시키면서 i와 j의 값을 쌍으로 출력하였다.
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.printf("[%d, %d]", i, j);
			}
			System.out.println();
		}
		
	}//main

	/*
	[1, 1][1, 2][1, 3][1, 4][1, 5]
	[2, 1][2, 2][2, 3][2, 4][2, 5]
	[3, 1][3, 2][3, 3][3, 4][3, 5]
	[4, 1][4, 2][4, 3][4, 4][4, 5]
	[5, 1][5, 2][5, 3][5, 4][5, 5]
	*/

}//class
