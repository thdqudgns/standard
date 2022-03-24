package standard.chapter06;

//매서드로 배열을 다루는 여러가지 방법
//매개변수의 타입이 배열니까 참조형 매개변수다. 그래서 sortArr메서드에서 정렬한 것이 원래의 배열에 영향을 미친다.

class ReferenceParamEx03 {
	public static void main(String[] args) {
		int[] arr = new int[] {3,2,1,6,5,4};
		
		printArr(arr);	//배열의 모든 요소를 출력
		sortArr(arr);	//배열을 정렬
		printArr(arr);	//정렬 후 결과를 출력
		System.out.println("sum=" + sumArr(arr));	//배열의 총합을 출력
	}
	
	static void printArr(int[] arr) {	//배열의 모든 요소를 출력
		System.out.print("[");
		for (int i : arr) 	//향상된 for문
			System.out.print(i + ",");
		System.out.println("]");
	}
	
	static int sumArr(int[] arr) {	//배열의 모든 요소의 합을 반환
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	static void sortArr(int[] arr) {	//배열을 오름차순으로 정렬
		for (int i = 0; i < arr.length-1; i++)	//배열의 길이보다 하나 적게 수행함
			for (int j = 0; j < arr.length-1-i; j++) {	//한 라운드가 지날 때마다 수행 횟수가 1씩 줄어듬
				if(arr[j] > arr[j+1]) {	//왼쪽이 크면 바꾼다 -> 오른쪽이 커지도록 = 오름차순
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
	} //sortArr
	
	/*
	[3,2,1,6,5,4,]
	[1,2,3,4,5,6,]
	sum=21
	*/
	
} //class