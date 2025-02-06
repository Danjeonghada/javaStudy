package ch05_conditional;

import java.util.Scanner;

public class conditionalEx {
	
	public static void main(String[] args) {
		/* 사용자로 부터 숫자를 입력받아 짝수인지 홀수인지 판별하시오.
		 * 조건1:정수만 입력받음.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요(정수)");
		System.out.print(">>>");
		// if문을 사용하여 짝수면 "짝수", 홀수면 "홀수"를 출력하시오.
		// 1. 입력받음(형변환 int로)
		int num = Integer.parseInt(scan.nextLine());
		// 2. 조건식 if, 연산자 operator 사용
		if(num % 2 == 0) {
		// 3. 출력
			System.out.printf("%d는 %s입니다", num, "짝수");
		}else {
			System.out.printf("%d는 %s입니다", num, "홀수");
		}
		
		// 내 방식
		String userInput = scan.nextLine();
		int nm = Integer.parseInt(userInput);
		if (nm % 2 == 0) {
			System.out.println("짝수");				
			}
		else { System.out.println("홀수");
		}
	}
}
