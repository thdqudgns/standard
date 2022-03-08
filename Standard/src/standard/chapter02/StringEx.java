package standard.chapter02;

public class StringEx {
	public static void main(String[] args) {
		
		// 문자열 더하기
		String name = "Ja" + "va";
		String str = name + 8.0;
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " "); //숫자 + 공백문자 -> 문자열 '7 '
		System.out.println(" " + 7); // -> 문자열 ' 7'
		System.out.println(7 + ""); //숫자 + 빈 문자열 -> 문자열 '7'
		System.out.println("" + 7); //-> 문자열 '7'
		System.out.println("" + ""); //빈 문자열 + 빈 문자열 -> ''
		System.out.println(7 + 7 + ""); //숫자 + 숫자 + 빈문자열 -> 14 : 숫자끼리 합쳐지고, 문자열로 변함
		System.out.println("" + 7 + 7); //빈문자열 + 숫자 + 숫자 -> 77 : 문자열로 변한 7과 숫자 7이 만나서 문자열 77이 됨
		
		//문자열과 만나면 무엇이든 문자열로 변한다.
		
	}

}
