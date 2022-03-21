package standard.chapter04;

public class FlowEx29 {
	public static void main(String[] args) {
		
		//3,6,9 게임
		
		for(int i=1;i<=100;i++) {	//i는 1부터 100까지 반복
			System.out.printf("i=%d ", i);	//i가 몇번째인지 출력
			
			int tmp = i;	//i를 tmp에 저장
			
			do {
				if(tmp%10%3==0 && tmp%10!=0) //tmp%10이 3의 배수(3,6,9)인지 확인(0 제외)
					System.out.print("짝");	//3,6,9로 끝나는 수들에서 "짝"이 출력된다
			} while((tmp/=10)!=0); //tmp /= 10은 tmp = tmp/10 과 동일 -> 여기서 tmp에 새로운 값을 저장하여 반복여부를 판단한다.
			
			//0~9는 몫이 0이 되므로 do-while문이 끝나고 for문으로 넘어간다.
			//10~100은 몫이 0이 아니므로 do-while문을 한 번 더 진행한다.
			//그 중에서도 30~, 60~, 90~은 몫이 3,6,9가 되어 tmp에 저장되므로, do-while문 내부의 if문을 진행하여 "짝"을 출력한다
			
			System.out.println();
		}
		
	}//main

}//class
