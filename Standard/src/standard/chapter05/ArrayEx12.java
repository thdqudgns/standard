package standard.chapter05;

public class ArrayEx12 {
	public static void main(String[] args) {
		
		//String배열 + 변수의 타입에 따른 기본값

		//String배열은 생성하면 null로 초기화 된다. null이 기본값이기 때문이다 
		//참조형 배열의 경우, 배열에 저장되는 것은 객체의 주소이다
		
		/* 변수의 타입에 따른 기본값
			boolean			false
			char			'\u0000'
			byte,short,int	0
			long			0L
			float			0.0f
			double			0.0d 또는 0.0
			참조형변수		null
		 */
		
		String[] names = {"Kim", "Park", "Yi"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("names["+i+"]:"+names[i]);	//배열에 저장되어 있는 값 출력
		}
		
		String tmp = names[2];
		System.out.println("tmp:"+tmp);	//참조형이지만, 변수의 주소가 아니라 저장된 문자열이 잘 출력된다
		names[0] = "Yu";	//값 수정하기
		
		for (String str : names) {
			System.out.println(str);	//수정된 대로 출력된다
		}
		
	} //main
	
	/*
	names[0]:Kim
	names[1]:Park
	names[2]:Yi
	tmp:Yi
	Yu
	Park
	Yi
	*/
	
} //class
