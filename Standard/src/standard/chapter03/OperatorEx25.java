package standard.chapter03;

import java.util.*;

public class OperatorEx25 {
	public static void main(String args[]) {
		
		//입력받은 문자가 숫자인지 영문자인지 확인하는 예제
		
		Scanner scanner = new Scanner(System.in); //스캐너 객체를 생성하여 입력받을 준비를 한다
		char ch = ' '; //공백으로 초기화
		
		System.out.printf("문자를 하나 입력하세요.>"); //같은 행에 입력하기 위해서 println이 아니라 printf를 사용함
		
		String input = scanner.nextLine();
		ch = input.charAt(0);
		//위에서 생성했던 scanner객체를 통해, java.util 패키지의 Scanner클래스 안에 있는 nextLine()메소드를 호출함
		//건너뛴 한 줄에 입력했던 것들을 input변수에 문자열로 저장한다
		//입력했던 문자열의 첫번째(0번째 인덱스) 문자 하나를 ch에 저장한다
		
		/* nextLine()
		 * 현재 줄을 지나 이 스캐너를 진행하고 건너뛴 입력을 반환합니다.
		 * 이 메서드는 끝에 있는 줄 구분 기호를 제외한 현재 줄의 나머지 부분을 반환합니다. 
		 * 위치는 다음 줄의 시작 부분으로 설정됩니다.
		 * 
		 * 이 메서드는 줄 구분 기호를 찾는 입력을 계속 검색하므로 
		 * 줄 구분 기호가 없는 경우 건너뛸 줄을 검색하는 모든 입력을 버퍼링할 수 있습니다.
		 * 
		 * 반환값:
		 * 	건너뛴 줄
		 * 예외:
		 * 	NoSuchElementException - 행을 찾을 수 없는 경우
		 * 	IllegalStateException - 이 스캐너가 닫혀 있는 경우
		 */
		
		/* charAt(int index)
		 * 지정된 인덱스의 char 값을 반환합니다.
		 * 인덱스의 범위는 0 ~ length() - 1 입니다. 
		 * 배열 인덱싱과 같이 시퀀스의 첫 번째 문자 값은 인덱스 0, 다음 문자 값은 인덱스 1입니다.
		 * 
		 * 인덱스로 지정된 char 값이 대리일 경우 대리 값이 반환됩니다.
		 * 
		 * 지정자: 
		 * 	CharSequence의 charAt(...)
		 * 파라미터: 
		 * 	char 값의 인덱스를 인덱싱합니다.
		 * 반환값: 
		 * 	이 문자열의 지정된 인덱스에 있는 char 값을 반환합니다. 첫 번째 문자 값은 인덱스0 입니다
		 * 예외:
		 * 	IndexOutOfBoundsException - index 인수가 음수이거나 이 문자열 길이 이상인 경우.
		 */
		
		if('0'<= ch && ch <='9') {
			System.out.printf("입력하신 문자는 숫자입니다.%n");
		}
		if(('a'<= ch && ch <='z') || ('A'<= ch && ch <='Z')) {
			System.out.printf("입력하신 문자는 영문자입니다.%n");
		}
		else {
			System.out.printf("입력하신 문자는 숫자도 아니고 영문자도 아닙니다.%n");
		}
		
		
	} //main method

} //class
