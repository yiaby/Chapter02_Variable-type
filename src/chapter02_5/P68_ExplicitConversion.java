package chapter02_5;

public class P68_ExplicitConversion {

	public static void main(String[] args) {
		
		/*
		 * (2)명시적 형변환(explicit conversion) : 강제 형 변환
		 * 
		 * =>자료손실 발생할수 있음
		 * =>바꿀 형을 괄호로 써서 명시 해야함
		 */
		
//[본문]----------------------------------------------------------------------------------------------
	     
			int iNUm = 1000;
			byte bNum = (byte)iNUm;
			
			System.out.println(iNUm);//1000
			System.out.println(bNum);//-24 
			
			//bNum=>byte형 범위(-128~127)초과,자료 손실 발생해 대입된값이 -24로 출력
			
			double dNum = 3.14;
			int iNum2 = (int)dNum;
			
			System.out.println(dNum); //3.14
			System.out.println(iNum2);//3
			
			//iNum2=> 실수의 소수점 이하 부분이 생략되고 정수부분인'3'만 출력
       
//[코딩해 보세요]----------------------------------------------------------------------------------------	
			double dNum1 = 1.2;
			float fNum1 = 0.9F;
			
			int iNum3 = (int)dNum1+(int)fNum1;
			int iNum4 = (int)(dNum1+fNum1);
			
			System.out.println(iNum3); //두 실수가 각각 형 변환되어 더해짐           =>1
			System.out.println(iNum4); //두 실수의 합이 먼저 계산되고 형 변환됨    =>2
	}

}
