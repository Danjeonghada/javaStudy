package cafe;

import java.util.Scanner;

public class CafeMain {

	public static void main(String[] args) {
		System.out.println("행동을 선택해주세요.");
		System.out.println("1. 스타벅스 방문 | 2. 아카 방문 | 3. 사무실 복귀.. ");
		Scanner scan = new Scanner(System.in);
		System.out.print(">>>");
		String cafe = scan.nextLine(); 
		int back = Integer.parseInt(cafe);
		if(back == 3) {
			System.out.println("사무실로 복귀합니다...");
		}
		System.out.println("어서오세요 "+"입니다.");
	}
}
