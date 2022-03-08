package standard.chapter02;

public class OverflowEx {
	public static void main(String[] args) {
		//오버플로우 확인	
		short sMin = -32768;	//short의 최솟값
		short sMax = 32767;		//short의 최댓값
		char cMin = 0;			//char의 최솟값
		char cMax = 65535;		//char의 최댓값
		
		System.out.println("sMin = " + sMin);
		System.out.println("sMin-1 = " + (short)(sMin-1)); //32767 : 최솟값에서 1을 빼니까 최댓값이 됨.
		System.out.println("sMax = " + sMax);
		System.out.println("sMax+1 = " + (short)(sMax+1)); //-32768 : 최댓값에서 1을 더하니까 최솟값이 됨.
		System.out.println("cMin = " + (int)cMin);
		System.out.println("cMin-1 = " + (int)--cMin); //65535 : 최솟값에서 1을 빼니까 최댓값이 됨.
		System.out.println("cMax = " + (int)cMax);
		System.out.println("cMax+1 = " + (int)++cMax); //0 : 최댓값에서 1을 더하니까 최솟값이 됨.
	}

}
