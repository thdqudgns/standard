package standard.chapter05;

public class ArrayEx14 {
	public static void main(String[] args) {
		
		//char배열과 String클래스의 변환
		
		//String클래스는 char배열에 기능을 추가한 것이다
		//String객체는 읽을 수만 있을 뿐 내용을 변경할 수는 없다
		
		String src = "ABCDE";
		
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);	//src의 i번째 문자를 ch에 저장
			System.out.println("src.charAt(" + i + "):" + ch);
		}
		
		// String을 char[]로 변환
		char[] chArr = src.toCharArray();
		
		// char배열 (char[])을 출력
		System.out.println(chArr);
		
	} //main
	
	/*
	src.charAt(0):A
	src.charAt(1):B
	src.charAt(2):C
	src.charAt(3):D
	src.charAt(4):E
	ABCDE
	*/
	
} //class
