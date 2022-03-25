package standard.chapter06;

//초기화 블럭 사용 이유: 배열이나 예외처리가 필요한 초기화에서는 명시적 초기화만으로는 복잡한 초기화 작업을 할 수 없다.
//이런 경우에 추가적으로 클래스 초기화 블럭을 사용하도록 한다.

class StaticBlockTest {
	
	static int[] arr = new int[10];	//명시적 초기화
	
	static {	//클래스 초기화 블럭
		for (int i = 0; i < arr.length; i++) {
			//1과 10 사이의 임의의 값을 배열 arr에 저장한다.
			arr[i] = (int)(Math.random()*10) + 1;
		}
	} //static block
	
	public static void main(String[] args) {
		for (int i = 0; i < arr.length; i++) 
			System.out.println("arr["+i+"] : " + arr[i]);
		
	}
	/*
	arr[0] : 1
	arr[1] : 3
	arr[2] : 5
	arr[3] : 8
	arr[4] : 2
	arr[5] : 9
	arr[6] : 8
	arr[7] : 6
	arr[8] : 4
	arr[9] : 5
	*/

}
