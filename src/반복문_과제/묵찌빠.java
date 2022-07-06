package 반복문_과제;

import java.util.Random;
import java.util.Scanner;

public class 묵찌빠 {

	public static void main(String[] args) {
		/*
		 * 묵찌빠 가위바위보를 한뒤 이긴쪽에서 가위바위보중 하나를 냄 같으면 이긴쪽 승리, 다르면 가위바위보 상황에 따라 다시 게임 시작
		 * 
		 */
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);

		int i = 0;
		int a = 0; // 가위
		int b = 1; // 바위
		int c = 2; // 보
		int turn = 1;
		int win = 0;
		
		while(true) {
			System.out.println("가위바위보(가위0, 바위1, 보2)");
			int me = scan.nextInt();
			int com = ran.nextInt(3);
			System.out.println("com : "+ com);
			if(me == 0 && com == 2) {
				win += 1;
			}else if(me == 1 && com == 0) {
				win += 1;
			}else if(me == 2 && com == 1) {
				win += 1;
			}else if(me == com) {
				continue;
			}else {
				win += 2;
			}
			while(true) {
				if(win % 2 == 1) { // me이긴경우 a
					System.out.println("me턴 묵찌빠");
					me = scan.nextInt();
					com = ran.nextInt(3);
					System.out.println("com : "+ com);
					if(me == 0 && com == 2) {
						continue;
					}else if(me == 1 && com == 0) {
						continue;
					}else if(me == 2 && com == 1) {
						continue;
					}else if(me == com) {
						System.out.println("me 승리");
						break;
					}else {
						win += 1; //com 턴
					}
				}else if(win % 2 == 0) { //com이긴경우
					System.out.println("com턴 묵찌빠");
					me = scan.nextInt();
					com = ran.nextInt(3);
					System.out.println("com : "+ com);
					if(com == 0 && me == 2) {
						continue;
					}else if(com == 1 && me == 0) {
						continue;
					}else if(com == 2 && me == 1) {
						continue;
					}else if(me == com) {
						System.out.println("com 승리");
						break;
					}else {
						win += 1; //me 턴
					}
				}
			}break;
			
		}

	}

}
