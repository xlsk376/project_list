package 조건문_과제;

import java.util.Random;
import java.util.Scanner;

public class 조건문5_문제01_가위바위보하나빼기 {

	public static void main(String[] args) {
		/*	
		[문제]
		[가위바위보 하나빼기]
		[1] 룰은 직접 정하고 게임을 최대한 비슷하게 만들어보시오.
		 */
		// 가위바위보를 낸뒤 하나빼기
		// 가위 0; 바위 1; 보 2;
		int count = 0;
		int 가위 = 0;
		int 바위 = 1;
		int 보 =2;
		int com = 0;
		int me = 0;
		Random ran = new Random();
		int com1 = ran.nextInt(3); // 가위바위보
		int com2 = ran.nextInt(3); // 가위바위보
		int comRandom = ran.nextInt(2); //오른손이나 왼손중에 선택
		System.out.println("왼손 : "+com1);
		System.out.println("오른손 : "+com2);
		if(comRandom == 0) {
			System.out.println("왼손선택");
			com = com1;
		}else {
			System.out.println("오른손선택");
			com = com2;
		}
		System.out.println("선택한 손 : "+com);
		System.out.println();
		int me1 = ran.nextInt(3); // 가위바위보
		int me2 = ran.nextInt(3); // 가위바위보
		int meRandom = ran.nextInt(2); //오른손이나 왼손중에 선택
		System.out.println("왼손 : "+me1);
		System.out.println("오른손 : "+me2);
		if(meRandom == 0) {
			System.out.println("왼손선택");
			me = me1;
		}else {
			System.out.println("오른손선택");
			me = me2;
		}
		System.out.println("선택한 손 : "+me);
		if(me == com) {
			System.out.println("비김");
		}else if(me == 0 && com == 2) { // 가위 0; 바위 1; 보 2;
			System.out.println("내가이김");
		}else if(me == 1 && com == 0) {
			System.out.println("내가이김");
		}else if(me == 2 && com == 1) {
			System.out.println("내가이김");
		}else {
			System.out.println("내가짐");
		}

		
		

	}

}
