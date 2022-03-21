package standard.chapter04;

public class FlowEx22 {
	public static void main(String[] args) {
		
		//향상된 for문, 배열 또는 컬렉션에 저장된 요소에 접근할 때 편리하다
		
		int[] arr = {10,20,30,40,50};
		int sum = 0;
		
		//기존의 for문으로 하나씩 꺼낼 때
		for(int i=0;i<arr.length;i++)
			System.out.printf("%d ", arr[i]);
		System.out.println();
		
		//향상된 for문으로 하나씩 꺼낼 때 - 더 간단하다
		for(int tmp : arr) { //배열 arr안의 요소가 하나씩 tmp에 저장된다
			System.out.printf("%d ", tmp); //이번에 tmp에 저장된 것을 출력한다
			sum += tmp; //sum으로 배열 요소들의 합계를 구한다. 점점 커진다
		}
		
		System.out.println();
		System.out.println("sum=" + sum);
		
	}//main
	
	/*
		10 20 30 40 50 
		10 20 30 40 50 
		sum=150
	*/

}//class
