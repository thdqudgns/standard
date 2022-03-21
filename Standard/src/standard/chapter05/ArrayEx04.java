package standard.chapter05;

public class ArrayEx04 {
	public static void main(String[] args) {
		
		//arraycopy()로 배열 복사하기, 지정된 범위의 값들을 통째로 복사한다
		
		char[] abc = {'A','B','C','D'};
		char[] num = {'0','1','2','3','4','5','6','7','8','9'};
		
		System.out.println(abc);
		System.out.println(num);
		
		/*
		ABCD
		0123456789
		*/
		
		//배열 abc와 num을 붙여서 하나의 배열(result)로 만든다
		char[] result = new char[abc.length+num.length];	//두 배열의 길이만한 새로운 배열을 생성함
		System.arraycopy(abc, 0, result, 0, abc.length);	//abc[0]에서 result[0]으로 abc.length개의 데이터를 복사
		System.arraycopy(num, 0, result, abc.length, num.length);	//num[0]에서 result[abc.length]으로 num.length개의 데이터를 복사
		System.out.println(result);
		
		//배열abc를 배열num의 첫번째 위치부터 배열 abc의 길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		//num의 인덱스 6 위치에 3개를 복사
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
		
		/*
		ABCD0123456789
		ABCD456789
		ABCD45ABC9
		*/
		
	} //main
} //class
