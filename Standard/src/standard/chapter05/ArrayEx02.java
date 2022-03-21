package standard.chapter05;

import java.util.Arrays;

public class ArrayEx02 {
	public static void main(String[] args) {
		
		//배열의 선언, 초기화(바로 {}로), 저장(for문 이용), 출력(Arrays.toString())
		
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[]{100,95,80,70,60};
		int[] iArr3 = {100,95,80,70,60}; //선언과 초기화를 동시에 할 때는 new연산자를 생략해도 된다.
		char[] chArr = {'a','b','c','d'};
		
		for(int i=0; i<iArr1.length; i++) {
			iArr1[i] = i + 1; //1~10의 숫자를 배열에 넣는다 
		}

		for(int i=0; i<iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10) + 1; //1~10의 랜덤 값을 배열에 넣는다 
		}
		
		//배열에 저장된 값들을 출력한다
		for(int i=0; i<iArr1.length; i++) {
			System.out.print(iArr1[i]+",");
		}
		
		System.out.println();
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr); //char형 배열은 배열의 이름만 적어도 배열에 저장된 char값들이 출력된다
		
	} //main
	
	/*
	1,2,3,4,5,6,7,8,9,10,
	[3, 8, 8, 10, 5, 10, 4, 8, 6, 4]
	[100, 95, 80, 70, 60]
	[a, b, c, d]
	[I@15db9742
	abcd
	*/

} //class
