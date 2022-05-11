package chapter02_5;

public class P65_ImplicitConversion {
	/*
	 * 형변환(type conversion)
	 * 
	 *(1)묵시적 형변환(implicit conversion): 자동 형 변환
	 * 
	 * |              [바이트 크기가 작은수 => 바이트 크기가 큰수]              |    [덜 정밀한 수=>더 정밀한 수]     |  
	 * | byte(1바이트)->short/char(2바이트)->int(4바이트)->long(8바이트)->|float(4바이트)->double(8바이트) |
	 */

	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum;	//byte형 값이 int형 변수로 대입됨(자료형 크기)
		
		System.out.println(bNum); //10
		System.out.println(iNum); //10
		
		int iNUm2 = 20;
		float fNum = iNUm2; //int형 값이 float형 변수로 대입됨(수의 정밀도)
		
		System.out.println(iNUm2); //20
		System.out.println(fNum);  //20.0
		
		double dNum;
		dNum = fNum + iNum;	//(1)int->float (2)float->double 두번의 형변환
		System.out.println(dNum); //30.0

	}

}
