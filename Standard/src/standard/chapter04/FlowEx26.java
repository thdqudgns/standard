package standard.chapter04;

public class FlowEx26 {
	public static void main(String[] args) {
		
		//while문으로 1부터 몇까지 더하면 누적합계가 100을 넘지 않는 제일 큰 수가 되는지 알아보기
		
		int sum = 0;
		int i = 0;
		
		while((sum += ++i) <= 100) { //i를 1씩 증가시켜서 sum에 계속 더해나간다.
			System.out.printf("%d - %d%n", i, sum);
		}
		
		//조건식을 따로 보면 이해가 쉽다
		//sum += ++i	i의 값을 1 증가시켜서 sum에 누적
		//sum <=100		sum의 값이 100보다 작거나 같은지 확인
		
	}//main
	
	/*
	1 - 1
	2 - 3
	3 - 6
	4 - 10
	5 - 15
	6 - 21
	7 - 28
	8 - 36
	9 - 45
	10 - 55
	11 - 66
	12 - 78
	13 - 91
	*/

}//class
