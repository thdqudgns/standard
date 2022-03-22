package standard.chapter05;

public class ArrayEx10 {
	public static void main(String[] args) {
		
		//버블 정렬 알고리즘
		
		int[] numArr = new int[10];
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int)(Math.random()*10));	//랜덤으로 배열에 0~9의 값 저장하고 출력
		}
		System.out.println();
		
		for (int i = 0; i < numArr.length-1; i++) { //배열의 길이-1 만큼 라운드를 반복해야 오름차순으로 제대로 정렬된다
			boolean changed = false;	//자리바꿈이 발생했는지 체크한다 (flag 역할)
			
			//한 라운드마다 오른쪽 끝에 큰 수가 정렬되므로, 반복횟수를 i만큼 빼서 정렬되지 않은 구간만 정렬한다. 0~9, 0~8, 0~7, ...
			for (int j = 0; j < numArr.length-1-i; j++) { 
				if(numArr[j] > numArr[j+1]) {	//오른쪽의 값이 작으면 서로 바꾼다
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true;		//자리바꿈이 발생했으니 changed를 true로.
				}
			}//end for j
			
			if(!changed) break;		//자리바꿈이 없으면 i 반복문을 벗어난다
			
			for (int k = 0; k < numArr.length; k++) {
				System.out.print(numArr[k]);	//정렬된 결과를 출력한다
			}
			System.out.println();
		}//end for i
		
	} //main
	
	/*
	0531286590
	0312565809
	0123556089
	0123550689
	0123505689
	0123055689
	0120355689
	0102355689
	0012355689
	*/

} //class
