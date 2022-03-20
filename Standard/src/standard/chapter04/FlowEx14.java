package standard.chapter04;

public class FlowEx14 {
	public static void main(String[] args) {
		
		//반복 확인
		
		for(int i=1, j=10; i<=10; i++,j--) {
			System.out.printf("%d \t %d%n", i, j);
		}
		
		//i는 1씩 커지고, j는 1씩 작아진다
		
		/*
		 * 1 	 10
		 * 2 	 9
		 * 3 	 8
		 * 4 	 7
		 * 5 	 6
		 * 6 	 5
		 * 7 	 4
		 * 8 	 3
		 * 9 	 2
		 * 10 	 1
		 */
		
	}//main

}//class
