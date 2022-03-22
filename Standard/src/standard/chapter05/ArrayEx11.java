package standard.chapter05;

public class ArrayEx11 {
	public static void main(String[] args) {
		
		//배열에 저장되어 있는 숫자를 카운트 하는 방법
		
		int[] numArr = new int[10];
		int[] counter = new int[10];	//두 배열 다 0이 저장되어 초기화 된 상태
		
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int)(Math.random()*10);	//0~9의 임의의 수를 numArr에 저장
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for (int i = 0; i < numArr.length; i++) {
			counter[numArr[i]]++;	//이 코드의 핵심
		}
		//numArr[i]에는 어떤 숫자가 저장되어 있다. 3이라고 치자
		//counter[3]에 저장된 숫자가 0에서 1로 바뀐다
		//numArr[i]에 5가 저장되어 있으면 counter[5]의 숫자가 1증가한다
		//이렇게 counter[]의 저장공간을 각 index에 해당하는 숫자를 세는 용도로 사용함

		for (int i = 0; i < numArr.length; i++) {
			System.out.println(i + "의 개수 :" + counter[i]);
		}
		//각 숫자가 몇 개 있는지 확인하기 위해 counter[i]를 출력한다 
		
	} //main
	/*
	4884384173
	0의 개수 :0
	1의 개수 :1
	2의 개수 :0
	3의 개수 :2
	4의 개수 :3
	5의 개수 :0
	6의 개수 :0
	7의 개수 :1
	8의 개수 :3
	9의 개수 :0
	*/
} //class
