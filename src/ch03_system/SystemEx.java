package ch03_system;

import java.util.Scanner;

public class SystemEx {
	
	public static void main(String[] args) {
		/* 1. 사용자의 이름:나이를 입력받아
		 * 이름 출력
		 * 나이 출력 하세요
		 * 
		 * 2. 사용자의 이름:나이를 입력받아
		 * 변수에 각각 할당 후
		 * 해당 변수로 사용자의 이름, 나이를 출력하시오
		 * 
		 * 단) 이름의 길이가 달라질 수 있음.
		 * hint(:) 콜론을 기준으로 앞이 이름, 뒤가 나이
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("이름:나이를 입력하세요=");
		String userString = scan.nextLine();
		System.out.println("==== 1번 문제 ====");
		int idx = userString.indexOf(":");
		System.out.println(idx);
		System.out.println(userString.substring(0, idx));
		System.out.println(userString.substring(idx+1));
		
		String nm = userString.substring(0, idx);
		String age = userString.substring(idx+1);
		// 콘솔입력은 String 사용
		// 숫자형태로 사용하려면 casting 형변환 해야함.
		int userAge = Integer.parseInt(age);
		System.out.println("입력하신 이름은:" +nm + " 나이는:" + age);
		System.out.println("입력하신 이름은:" +nm + " 나이는:" + userAge);
		
		// 나의 풀이
		// String userInput = scan.nextLine();
		// System.out.println(userInput);
		// System.out.println(userInput.substring(0,userInput.indexOf(":")));
		// System.out.println(userInput.substring(userInput.indexOf(":") + 1));
		
		// String name = userInput.substring(0,userInput.indexOf(":"));
		// String age1 = userInput.substring(userInput.indexOf(":") + 1);
		
		// System.out.println(name);
		// System.out.println(age1);
		
	
	}

}
