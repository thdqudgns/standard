package standard.chapter04;

public class FlowEx33 {
	public static void main(String[] args) {
		
		//break Loop1, break, continue Loop1, continue 각각의 상황마다 다르게 출력된다.
		
		//반복문에 이름을 붙여 주고, break문에 반복문 이름을 지정해주면 하나 이상의 반복문도 벗어날 수 있다.
		//for문에 Loop1이라는 이름을 붙였다
		
		Loop1 : for(int i=2; i <=9; i++) {
			for(int j=1; j <=9; j++) {
				if(j==5)	//각각의 상황마다 다르게 출력된다.
//					break Loop1;
//					break;
//					continue Loop1;
					continue;
				System.out.println(i + "*" + j + "=" + i*j);
			} // end of for i	//continue; 는 여기로
			System.out.println(); //break; 는 여기로
		} // end of Loop1	//continue Loop1;는 여기로
		//break Loop1; 는 여기로
		
	}//main
	
	/* break Loop1
	
	2*1=2
	2*2=4
	2*3=6
	2*4=8
	*/

	/* break;
	
	2*1=2
	2*2=4
	2*3=6
	2*4=8

	(생략)

	9*1=9
	9*2=18
	9*3=27
	9*4=36
	*/
	
	/* continue Loop1;
	
	2*1=2
	2*2=4
	2*3=6
	2*4=8
	(생략)
	9*1=9
	9*2=18
	9*3=27
	9*4=36
	*/
	
	/* continue;
	
	2*1=2
	2*2=4
	2*3=6
	2*4=8
	2*6=12
	2*7=14
	2*8=16
	2*9=18
	
	(생략)
	
	9*1=9
	9*2=18
	9*3=27
	9*4=36
	9*6=54
	9*7=63
	9*8=72
	9*9=81
	*/

}//class
