package chapter02_3;

public class P60_TypeInference {

	public static void main(String[] args) {
		int i = 10;				
		double j = 10.0;       
		String str = "hello";
		
		/* 자바10버전 => 자료형을 쓰지 않고도 변수를 사용 할 수 있음
		 * var i = 10;
		 * var j = 10.0;
		 * var str = "hello";
		 * !한번 선언된 변수는 타입을 바꿀 수 없음!
		 * !지역변수만 가능함!
		 */
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		//str=3;   (이미 String으로 선언 되었기 때문에 정수 값을 넣을 수 없음)
				
	}

}
