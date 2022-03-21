package standard.chapter04;

public class FlowEx23 {
	public static void main(String[] args) {
		
		//while문의 사용
		
		int i = 5;
		
		while(i--!=0) {
			System.out.println(i + " - I can do it.");
		}
		
		//i--가 후위형이므로 조건식이 평가된 후에 i의 값이 감소한다.
		//예를 들어, i의 값이 1일 때는 조건식이 참으로 평가된 후에 i의 값이 1 감소되어 0이 된다.
		//그래서 i의 값이 4~0으로 출력된 것이다.
		
	}//main
	/*
	4 - I can do it.
	3 - I can do it.
	2 - I can do it.
	1 - I can do it.
	0 - I can do it.
	*/

}//class
