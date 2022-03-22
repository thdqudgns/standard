package standard.chapter05;

public class ArrayEx15 {
	public static void main(String[] args) {
		
		//문자열을 모르스 부호로 변환하는 예제 (13번과 비슷)
		
		String source = "SOSHELP";
		String[] morse = {".-", "-...", "-.-", "-..", "."
						, "..-.", "--.", "....", "..", ".---"
						, "-.-", ".-..", "--", "-.", "---"
						, ".--.", "--.-", ".-.", "...", "-" 
						, "..-", "...-", ".--", "-..-", "-.--"
						, "--.." };
		
		String result="";
		
		for (int i = 0; i < source.length(); i++) {
			result += morse[source.charAt(i)-'A'];
			//13번 예제와 같은 방식이다. char배열 대신 이번엔 String을 사용했다
			//source에서 한 문자씩 읽어와서 morse배열에서 해당 요소의 문자열을 반환하여 result에 추가한다 
		}
		System.out.println("source:" + source);
		System.out.println("morse:" + result);
		
	} //main
	
	/*
		source:SOSHELP
		morse:...---.........-...--.
	*/
	
} //class
