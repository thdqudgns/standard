package standard.chapter04;

public class FlowEx30 {
	public static void main(String[] args) {
		
		//break문은 자신이 포함된 가장 가까운 반복문을 벗어난다, 주로 if문과 함께 사용되어 특정 조건을 만족하면 반복문을 벗어나도록 한다
		
		//1부터 몇까지 합하면 100을 넘어가는지 알아내는 예제
		//이처럼 무한 반복문에는 조건문과 break문이 항상 같이 사용된다. 그렇지 않으면 무한 반복되기 때문이다
		
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum>100)	//합계가 100이 넘었을 때, break문이 수행된다. 그 전까진 그냥 넘어감
				break;	//break문이 수행되면 밑부분을 실행하지 않고 while문을 완전히 벗어난다
			++i;
			sum += i; //점점 커진다
		} //end of while
		
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
		
	}//main

}//class
