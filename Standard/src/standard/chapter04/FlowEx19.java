package standard.chapter04;

public class FlowEx19 {
	public static void main(String[] args) {
		
		//for문 괄호{}의 생략, 바깥쪽 for문에게는 안 쪽 for문 전체가 하나의 문장이므로 바깥쪽 for문의 괄호도 생략이 가능하다
		
		for(int i=1;i<=3;i++) 
			for(int j=1;j<=3;j++) 
				for(int k=1;k<=3;k++)
				System.out.println(""+i+j+k); //""을 이용해서 문자열로 만들어줌
		
	}//main
	
	/*
	111
	112
	113
	121
	122
	123
	131
	132
	133
	(생략)
	311
	312
	313
	321
	322
	323
	331
	332
	333
	*/

}//class
