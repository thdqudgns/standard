package standard.chapter04;

public class FlowEx24 {
	public static void main(String[] args) {
		
		//while문의 사용2
		
		int i = 11;
		
		System.out.println("카운트 다운을 시작합니다.");
		
		while(i--!=0) {
			System.out.println(i);
			
			for(int j=0;j<2_000_000_000;j++) {
				;
			}
		}
		
		System.out.println("GAME OVER");
		
	}//main
	
	/*
		카운트 다운을 시작합니다.
		10
		9
		8
		7
		6
		5
		4
		3
		2
		1
		0
		GAME OVER
	*/
	
}//class
