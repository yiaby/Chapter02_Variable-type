package chapter02_5;

public class P71_Exercise {

	public static void main(String[] args) {
		//Q4.변수 두개를 선언해서 10과 2.0을 대입하고 두 변수의 사칙 연산 결과를 정수로 출력해 보세요.
		
			int iNum = 10;
			double dNum = 2.0;
			
			int iNum1 = iNum + (int)dNum;
			int iNum2 = iNum - (int)dNum;
			int iNum3 = iNum * (int)dNum;
			int iNum4 = iNum / (int)dNum;
			
			System.out.println("[Q4.내가 쓴 답]");
			System.out.println(iNum1);
			System.out.println(iNum2);
			System.out.println(iNum3);
			System.out.println(iNum4);
			System.out.println("-----------");
//Q4.[정답]---------------------------------------------------------------------------------------------------
			int i = 10;
			double j = 2.0;
			
			System.out.println("[정답]");
			System.out.println((int)(i+j));
			System.out.println((int)(i-j));
			System.out.println((int)(i*j));
			System.out.println((int)(i/j));
			System.out.println("===========");
			
//===========================================================================================================			
		//Q5.'글'이라는 한글 문자의 유니코드 값을 찾아서 char형으로 선언한 변수에 저장한 뒤 그 변수를 출력하여 확인해 보세요.
		    int unicode = 44544;
		    char letter = (char)unicode;
		    
		    System.out.println("[Q5.내가 쓴 답]");
		    System.out.println(letter);
		    System.out.println("-----------");
//Q5.[정답]----------------------------------------------------------------------------------------------------		    
		    char ch = '\uAE00';
		    System.out.println("[정답]");
		    System.out.println(ch);
		    System.out.println("===========");
	}

}
