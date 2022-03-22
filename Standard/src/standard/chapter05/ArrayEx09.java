package standard.chapter05;

import java.util.Arrays;

public class ArrayEx09 {
	public static void main(String[] args) {
		
		//불연속적인 값들로 배열 채우기 + Math.random() 사용
		
		int[] code = {-4,-1,3,6,11};
		int[] arr = new int[10];	//배열의 빈 공간은 0으로 초기화 된다
		
		for(int i=0;i<arr.length;i++) {
			int tmp = (int)(Math.random()*code.length); //0~4 (4.9 -> 4)
			arr[i] = code[tmp];	//i가 증가함에 따라 arr[0]~arr[9]에 code에 저장된 값들 중 랜덤으로 저장된다
		}
		
		System.out.println(Arrays.toString(arr)); //배열의 요소들이 [ , , ]꼴의 문자열로 출력된다
		
	} //main
	
	//[6, -4, -1, 6, -4, -1, 6, -4, -1, -4]
	
} //class
