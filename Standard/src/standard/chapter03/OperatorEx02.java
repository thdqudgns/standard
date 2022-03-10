package standard.chapter03;

public class OperatorEx02 {
	public static void main(String args[]) {
		
		//단독으로 사용되지 않은 경우 전위형과 후위형의 결과는 다르다
		
		int i=5, j=0;
		
		j=i++;	//후위
		System.out.println("j=i++; 실행 후, i=" + i + ", j=" + j);	//j=i++; 실행 후, i=6, j=5
		
		i=5;	//처음 값으로 되돌림
		j=0;
		
		j=++i;	//전위
		System.out.println("j=++i; 실행 후, i=" + i + ", j=" + j);	//j=++i; 실행 후, i=6, j=6
		
		//후위형은 변수의 값을 먼저 읽어온 후에 값을 증가시킨다
		
		//전위형: ++i; j = i
		//후위형: j = i; i++; 
		
		
	} //main method

} //class
