package standard.chapter02;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		
		//Scanner : 화면에서 입력받기 + System.in, Scanner.nextLine(), Integer.parseInt()
		
		Scanner scanner = new Scanner(System.in); //스캐너 객체를 생성하여 입력받을 준비를 한다
		
		/* InputStream java.lang.System.in
		 * 
		 * "표준" 입력 스트림. 
		 * 이 스트림은 이미 열려 있으며 입력 데이터를 제공할 준비가 되었습니다. 
		 * 일반적으로 이 스트림은 키보드 입력 또는 호스트 환경 또는 사용자가 지정한 다른 입력 소스에 해당합니다.
		 */
		
		System.out.print("두 자리 정수를 하나 입력해주세요.> "); //두 자리 정수를 하나 입력해주세요.> 
		String input = scanner.nextLine(); //예) 22입력
		int num = Integer.parseInt(input); //입력받은 문자열을 숫자로 변환
		
		//위에서 생성했던 scanner객체를 통해, java.util 패키지의 Scanner클래스 안에 있는 nextLine()메소드를 호출함
		//건너뛴 한 줄에 입력했던 것을 문자열타입의 변수공간인 input에 저장한다
		
		/* String java.util.Scanner.nextLine();
		 * 
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
		
		/* int java.lang.Integer.parseInt();
		 * 
		 * 문자열을 정수로 해석합니다. 
		 * 문자열의 문자는 모두 10진수여야 합니다.
		 * 단, 첫 번째 문자는 음의 값을 나타내는 ASCII 마이너스 기호 '-'(\u005Cu002D) 
		 * 또는 양의 값을 나타내는 ASCII 플러스 기호 '+'(\u005Cu002B)일 수 있습니다. 
		 * 인수와 기수 10이 parseInt(java.lang.String, int) 메서드에 인수로 지정된 것과 동일하게 결과 정수 값이 반환됩니다.
		 * 
		 * 파라미터:
		 * 	구문 분석할 int 표현을 포함하는 문자열
		 * 반환값:
		 * 	인수로 표시되는 10진수 정수 값.
		 * 예외:
		 * 	NumberFormatException - 문자열에 구문 분석 가능한 정수가 포함되지 않은 경우.
		 */
		
		
		System.out.println("입력내용 : " + input); //입력내용 : 22
		System.out.printf("num=%d%n", num); //num=22
	}

}
