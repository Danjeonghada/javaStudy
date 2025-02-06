package practice;

public class Result01 {
	/*
	 * q.1 사용자로부터 국어, 영어, 수학, 점수를 각각 입력받아
	 * 
	 */
	public static void main(String[] args) {
		// 정수 나눗셈(int)
		int a = 7;
		int b = 3;
		int intResult = a/b;
		System.out.println("정수 나눗셈:" + intResult);
		
		double c = 7;
		double d = 3;
		double doubleResult = c/d;
		System.out.println("double 나눗셈:" + doubleResult);
		
		// 정수 나눗셈을 캐스팅
		double mixReulst = (double)a/b;
		System.out.println("캐스팅된 나눗셈" + mixReulst);
		// ex
		System.out.println(4 / 4);
		System.out.println(4/ 3.0);
		
		int intResult2 = (int) (c/d);
		System.out.println(intResult2);
		
		System.out.printf("결과: %.2f %n", mixReulst);
		
	}

}
