package standard.chapter03;

public class OperatorEx01 {
	public static void main(String args[]) {
		
		//전위연산과 후위연산
		//전위형: 값이 참조되기 전에 동작
		//후위형: 값이 참조된 후에 동작
		
		int i=5;
		i++;	//i=i+1 과 같은 의미다
		System.out.println(i);	//6
		
		i=5;
		++i;
		System.out.println(i);	//6
		
		//증감연산자가 수식이나 메서드 호출에 포함되지 않고,
		//독립적인 하나의 문장으로 쓰인 경우에는 전위형과 후위형의 차이가 없다
		
	} //main method

} //class
