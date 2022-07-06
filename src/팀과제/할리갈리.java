package 팀과제;

import java.util.Random;
import java.util.Scanner;

public class 할리갈리 {

	public static void main(String[] args) {
		/*
		 * 과일 2종류 카드는 1~5개 짜리 카드 14장 딸기, 바나나
		 * 
		 */
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int turn = 1;
		int st1 = 0;
		int st2 = 0;
		int ba1 = 0;
		int ba2 = 0;
		int p1 = 15;
		int p2 = 15;
		int count = 0; // 카드 더미
		while(true) {
			while (true) { // 너 하나 나 하나
				// int t = scan.nextInt();
				// System.out.println(p1 + " " + p2); // 시작카드개수
				if (turn % 2 == 1) { // p1 턴
					int r = ran.nextInt(2); // 과일 딸기 0 , 바나나 1
					if (r == 0) { // 딸기
						ba1 = 0; // 딸기가 바나나 카드를 덥음
						int r1 = ran.nextInt(5) + 1;
						st1 = r1;
						System.out.println("P1 딸기 개수 : " + st1);
						p1 -= 1;
						count += 1;
						turn += 1;
					} else if(r == 1){ // 바나나
						st1 = 0; // 바나나가 딸기 카드를 덥음
						int r2 = ran.nextInt(5) + 1;
						ba1 = r2;
						System.out.println("P1 바나나 개수 : " + ba1);
						p1 -= 1;
						count += 1;
						turn += 1;
					}
					
				} else { // p2 턴
					int r = ran.nextInt(2); // 과일 딸기 0 , 바나나 1
					if (r == 0) { // 딸기
						ba2 = 0; // 딸기가 바나나 카드를 덥음
						int r1 = ran.nextInt(5) + 1;
						st2 = r1;
						System.out.println("P2 딸기 개수 : " + st2);
						p2 -= 1;
						count += 1;
						turn += 1;
					} else if( r == 1){ // 바나나
						st2 = 0; // 바나나가 딸기 카드를 덥음
						int r2 = ran.nextInt(5) + 1;
						ba2 = r2;
						System.out.println("P2 바나나 개수 : " + ba2);
						p2 -= 1;
						count += 1;
						turn += 1;
					}
					
				}
				
				System.out.println("------------------------------------");
				System.out.println("p1 카드 : " + p1 + " " + "p2 카드 : " + p2 + " " + "카드 더미 : " + count);
				System.out.println("딸기 : " + (st1 + st2) + " " + "바나나 : " + (ba1 + ba2));
				System.out.println("------------------------------------");

				// 성공시 과일 개수 다 초기화

				//int sum1 = st1 + st2;
				//int sum2 = ba1 + ba2;
				if (st1 + st2 == 5) { // 딸기 성공
					System.out.println("딸기합 : "+st1 + " " + st2 + " " + ba1 + " " + ba2);
					int bell = ran.nextInt(2);
					System.out.println("딸기합 벨 : "+bell);
					if (bell == 0) {
						System.out.println("P1 BELL 성공");
						p1 += count;
						p1 += 1;
						p2 -= 1;
						count = 0;
						st1 = 0;
						st2 = 0;
						ba1 = 0;
						ba2 = 0;
					} else if(bell == 1) {
						System.out.println("P2 BELL 성공");
						p2 += count;
						p2 += 1;
						p1 -= 1;
						count = 0;
						st1 = 0;
						st2 = 0;
						ba1 = 0;
						ba2 = 0;
					}
				}else if (ba1 + ba2 == 5) {
					System.out.println("바나나합 : "+st1 + " " + st2 + " " + ba1 + " " + ba2);
					int bell = ran.nextInt(2);
					System.out.println("바나나합 벨 : "+bell);
					if (bell == 0 ) {
						System.out.println("P1 BELL 성공");
						p1 += count;
						p1 += 1;
						p2 -= 1;
						count = 0;
						st1 = 0;
						st2 = 0;
						ba1 = 0;
						ba2 = 0;
					} else if(bell == 1 ){
						System.out.println("P2 BELL 성공");
						p2 += count;
						p2 += 1;
						p1 -= 1;
						count = 0;
						st1 = 0;
						st2 = 0;
						ba1 = 0;
						ba2 = 0;
					}
				}else if(st1 == 5 ||st2 == 5 || ba1 == 5 || ba2 == 5) {
					System.out.println("각각 : "+st1 + " " + st2 + " " + ba1 + " " + ba2);
					int bell = ran.nextInt(2);
					System.out.println("각각 벨 : "+bell);
					if (bell == 0 ) {
						System.out.println("P1 BELL 성공");
						p1 += count;
						p1 += 1;
						p2 -= 1;
						count = 0;
						st1 = 0;
						st2 = 0;
						ba1 = 0;
						ba2 = 0;
					} else if(bell == 1 ) {
						System.out.println("P2 BELL 성공");
						p2 += count;
						p2 += 1;
						p1 -= 1;
						count = 0;
						st1 = 0;
						st2 = 0;
						ba1 = 0;
						ba2 = 0;
					}
				}

				if (p1 <= 0) {
					System.out.println("p2 승리");
					break;
				} else if (p2 <= 0) {
					System.out.println("p1 승리");
					break;
				}

			}
			System.out.println();
			System.out.println("[1.계속] [0.종료]");
			int sel = scan.nextInt();
			if(sel == 0) {
				System.out.println("종료");
				break;
			}else {
				p1 = 15;
				p2 = 15;
				count = 0;
			}
		}
		

	}

}
