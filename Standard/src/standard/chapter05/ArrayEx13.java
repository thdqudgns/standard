package standard.chapter05;

public class ArrayEx13 {
	public static void main(String[] args) {
		
		//for문을 이용해서 배열hex에 저장된 문자를 하나씩 읽어서 그에 해당하는 이진수 표현을 배열 binary에서 얻어 result에 덧붙이고 출력한다
		
		char[] hex = {'C', 'A', 'F', 'E'};
		
		String[] binary = { "0000", "0001", "0010", "0011"
						, "0100", "0101", "0110", "0111"
						, "1000", "1001", "1010", "1011"
						, "1100", "1101", "1110", "1111" };	//16진수로 0~F
		
		String result="";
		
		for (int i = 0; i < hex.length; i++) {	//0~3, 4번 반복
			if('0'<=hex[i] && hex[i] <='9') {	//hex[i]에 저장된 문자가 0~9 사이라면
				result += binary[hex[i]-'0'];	//result에 binary배열의 hex[i]-'0'번째 요소의 값을 저장하고
			} else {							//hex[i]에 저장된 문자가 0~9 사이가 아니라 'A' ~ 'F' 이면
				result += binary[hex[i]-'A'+10];//result에 binary배열의 hex[i]-'A'+10번째 요소의 값을 저장한다
			}
		}
		
		//'C'-'A'=2, 2+10=12, binary[12] = "1100"
		//'A'-'A'=0, 0+10=10, binary[10] = "1010"
		//'F'-'A'=5, 5+10=15, binary[15] = "1111"
		//'E'-'A'=4, 4+10=14, binary[14] = "1110"
		//result = 1100 1010 1111 1110
		
		System.out.println(hex);			//배열만 쓰면 내부의 값이 출력되지만,
		System.out.println("hex:" + hex);	//문자열과 같이 쓰니까 배열의 주소가 출력된다
		
		System.out.println("hex:"+ new String(hex));	//그래서 new연산자를 사용했나 보다
		System.out.println("binary:"+ result);	//result는 배열이 아니라 문자열변수이므로 잘 출력된다
		
	} //main
	
	/*
		hex:CAFE
		CAFE
		hex:[C@2a139a55
		binary:1100101011111110
	*/
	
} //class
