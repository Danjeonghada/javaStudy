package practice;

import java.util.Scanner;

public class result04 {
	public static void main(String[] args) {
		// 두대의 A, B 엘리베이터 이동 프로그램 구현
		// 1. 사용자의 현재 위치 입력 시 가까운 엘리베이터 이동
		// 2. 사용자의 위치와 두 엘리베이터 위치 차이 동일 시 위 층 엘리베이터 작동
		// 3. 엘리베이터가 같은 층에 위치할 시 엘리베이터 A 작동
		// 4. 사용자의 위치로 엘리베이터의 위치 변경
		// 5. 엘리베이터 프로그램 종료(q, Q, EXIT, Exit, exit 중 하나 입력)
		// 사용자가 엘리베이터 탑승 후 층을 입력하면 해당 층으로 엘리베이터 이동
		int elA = (int) (Math.random() * 10 + 1);
		int elB = (int) (Math.random() * 10 + 1);
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("=========== 엘리베이터 ============");
			System.out.println("승강기 A의 현재 위치:" + elA);
			System.out.println("승강기 B의 현재 위치:" + elB);
			System.out.print("몇층에 계시나요?[종료는 q 또는 exit]:");
			String num = scan.nextLine();
			if(num.equals("q") || num.equals("Q") || num.equals("exit") || num.equals("EXIT") || num.equals("Exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			int user = Integer.parseInt(num);
			int changeA = Math.abs(user - elA);
			int changeB = Math.abs(user - elB);
			
			if(changeA < changeB) {
				System.out.println("엘리베이터 A가 " + user + "층으로 이동하였습니다.");
				elA = user;
			}
			else if(changeA > changeB) {
				System.out.println("엘리베이터 B가 " + user + "층으로 이동하였습니다.");
				elB = user;
			}
			else {
				if(elA > elB) {
					System.out.println("엘리베이터 A가 " + user + "층으로 이동하였습니다.");
					elA = user;
				}
				else if(elA < elB) {
					System.out.println("엘리베이터 B가 " + user + "층으로 이동하였습니다.");
					elB = user;
				}
				else {
					System.out.println("엘리베이터 A가 " + user + "층으로 이동하였습니다.");
					elA = user;
				}
			}
			System.out.print("엘리베이터에 탑승하셨습니다. 이동하실 층을 선택하여 주세요:");
			String move = scan.nextLine();
			int moving = Integer.parseInt(move);
			
			if(elA == user) {
				System.out.println("엘리베이터 A가 " + moving + "층에 도착하였습니다.");
				elA = moving;
			}
			else {
				System.out.println("엘리베이터 B가 " + moving + "층에 도착하였습니다.");
				elB = moving;
			}
			
		}
	}

}
