package javaPractice.java0224;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		int kor1, kor2, kor3;
		int total;
		float avg;
		int menu;
		Scanner scan = new Scanner(System.in);

		kor1 = 0;
		kor2 = 0;
		kor3 = 0;

		종료:
		while (true) {
			// -----------------메뉴입력부분=-----
			System.out.println("──────────────────────────");
			System.out.println("성적입력");
			System.out.println("────────────────────────");
			System.out.println("\t1.성적입력");
			System.out.println("\t2.성적출력");
			System.out.println("\t3.종료");
			System.out.println("\t>");
			menu = scan.nextInt();

			switch(menu) {
			
			case 1:
				// -----성적입력부분--------
				System.out.println("───────────────────────────");
				System.out.println("메인 메뉴");
				System.out.println("───────────────────────────");

				do {
					System.out.println("국어1:");
					kor1 = scan.nextInt();

					if (kor1 < 0 || 100 < kor1)
						System.out.println("성적범위(0~100)을 초과했습니다.");

				} while (kor1 < 0 || 100 < kor1);
				
				
				do {
					System.out.println("국어2:");
					kor2 = scan.nextInt();

					if (kor2 < 0 || 100 < kor2)
						System.out.println("성적범위(0~100)을 초과했습니다.");

				} while (kor2 < 0 || 100 < kor2);

				do {
					System.out.println("국어3:");
					kor3 = scan.nextInt();

					if (kor3 < 0 || 100 < kor3)
						System.out.println("성적범위(0~100)을 초과했습니다.");

				} while (kor3 < 0 || 100 < kor3);
			
			case 2: 
				// -----성적 출력 부분-------------------

				total = kor1 + kor2 + kor3;
				avg = total / 3.0f;

				System.out.println("────────────────────────── ");
				System.out.println("성적 출력");
				System.out.println("───────────────────────────");

				System.out.printf("\t국어1: %3d\n", kor1);
				System.out.printf("\t국어2: %3d\n", kor2);
				System.out.printf("\t국어3: %3d\n", kor3);
				System.out.printf("\t총점: %3d\n", total);
				System.out.printf("\t평균: %6.2f\n", avg);
				System.out.printf("------------------------\n");
				break;
				
			case 3:  
				break 종료;
			
			default:
				System.out.println("---입력오류 1~3까지만 입력가능합니다. ");
			}
			
		}
		System.out.println("good bye~");
	}
}