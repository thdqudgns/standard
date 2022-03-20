package standard.chapter04;

public class FlowEx12 {
	public static void main(String[] args) {
		
		//for문은 주로 반복횟수를 알고 있을 때 사용한다, "초기화 - 조건식 - 수행될 문장 - 증감식" 순서로 진행된다
		
		for(int i=1;i<=5;i++)
			System.out.println(i); //i의 값을 출력한다
		
		for(int i=1;i<=5;i++)
			System.out.print(i); //print를 쓰면 가로로 출력된다.
		
		System.out.println();
		
		/*
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 * 12345
		 */
		
	}//main

}//class
