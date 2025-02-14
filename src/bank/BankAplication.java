package bank;

import java.util.Scanner;

public class BankAplication {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("-------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			String choice = scan.nextLine();
			int num = Integer.parseInt(choice);
			if(num == 1) {
				System.out.println("-------------");
				System.out.println("계좌생성");
				System.out.println("-------------");
			}else if(num == 2) {
				System.out.println("-------------");
				System.out.println("계좌목록");
				System.out.println("-------------");
				
			}else if(num == 3) {
				System.out.println("-------------");
				System.out.println("예금");
				System.out.println("-------------");
			
			}else if(num == 4) {
				System.out.println("-------------");
				System.out.println("출금");
				System.out.println("-------------");
			
			}else if(num == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
	}

}
