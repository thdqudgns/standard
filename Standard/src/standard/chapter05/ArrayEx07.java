package standard.chapter05;

public class ArrayEx07 {
	public static void main(String[] args) {
		
		//배열 내부의 값들 섞기, Math.random() 이용 
		
		int[] numArr = new int[10];
		
		for(int i=0;i<numArr.length;i++) {
			numArr[i] = i;	//배열을 0~9의 숫자로 초기화한다
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for (int i = 0; i < 100; i++) { // 100번 반복한다
			int n = (int)(Math.random()*10);	//0~9 중의 한 값을 임의로 얻는다
			int tmp = numArr[0];
			numArr[0] = numArr[n];	//임의의 인덱스에 저장되어있는 값을 첫번째 자리로 옮기고
			numArr[n] = tmp;		//첫번째 자리에 있던 값을 임의의 인덱스로 옮긴다
		}
		
		for(int i=0; i<numArr.length;i++)
			System.out.print(numArr[i]);
		
		/*
		0123456789
		1852479360
		*/
		
	} //main
} //class
