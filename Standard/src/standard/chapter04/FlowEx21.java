package standard.chapter04;

public class FlowEx21 {
	public static void main(String[] args) {
		
		//2중 반복문 안에 if문을 넣어서 조건에 맞는 쌍만 출력함으로써 다양한 모양을 만들어 낼 수 있다
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if(i==j) {
					System.out.printf("[%d,%d]", i, j);
				} else {
					System.out.printf("%5c", ' ');
				} //if-else문의 끝
			} //내부 for문의 끝
			System.out.println();
		} //외부 for문의 끝
		
	}//main

	/*
		[1,1]                    
		     [2,2]               
		          [3,3]          
		               [4,4]     
		                    [5,5]
	*/

}//class
