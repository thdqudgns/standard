package standard.chapter04;

public class FlowEx31 {
	public static void main(String[] args) {
		
		//continue문, continue는 반복을 계속 수행하게 한다
		
		//반복이 진행되는 도중에 continue문을 만나면, 반복문의 끝으로 이동하여 다음 반복으로 넘어간다
		//break문은 반복문을 벗어나게 하지만, continue는 반복을 계속 수행하게 한다
		
		for (int i = 0; i <= 10; i++) {
			if(i%3==0) //3의 배수에서 continue문이 수행되어 다음 반복으로 넘어간다
				continue;
			System.out.println(i);
		}
		
	}//main
	
	/* 3,6,9만 없다. 넘어갔기 때문이다
	1
	2
	4
	5
	7
	8
	10
	*/

}//class
