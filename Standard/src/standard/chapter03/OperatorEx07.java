package standard.chapter03;

public class OperatorEx07 {
	public static void main(String args[]) {
		
		//작은 자료형을 사용할 때의 데이터 손실
		
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a * b); 
		System.out.println(c);	//44 -> 300이지만 44로 나온다. int에서 byte로 형변환하며 데이터 손실이 발생한다.
		//이러한 값손실을 예방하기 위해서는 충분히 큰 자료형을 사용해야 한다.

		
	} //main method

} //class
