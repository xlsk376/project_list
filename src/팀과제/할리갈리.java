package ������;

import java.util.Random;
import java.util.Scanner;

public class �Ҹ����� {

	public static void main(String[] args) {
		/*
		 * ���� 2���� ī��� 1~5�� ¥�� ī�� 14�� ����, �ٳ���
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
		int count = 0; // ī�� ����
		while(true) {
			while (true) { // �� �ϳ� �� �ϳ�
				// int t = scan.nextInt();
				// System.out.println(p1 + " " + p2); // ����ī�尳��
				if (turn % 2 == 1) { // p1 ��
					int r = ran.nextInt(2); // ���� ���� 0 , �ٳ��� 1
					if (r == 0) { // ����
						ba1 = 0; // ���Ⱑ �ٳ��� ī�带 ����
						int r1 = ran.nextInt(5) + 1;
						st1 = r1;
						System.out.println("P1 ���� ���� : " + st1);
						p1 -= 1;
						count += 1;
						turn += 1;
					} else if(r == 1){ // �ٳ���
						st1 = 0; // �ٳ����� ���� ī�带 ����
						int r2 = ran.nextInt(5) + 1;
						ba1 = r2;
						System.out.println("P1 �ٳ��� ���� : " + ba1);
						p1 -= 1;
						count += 1;
						turn += 1;
					}
					
				} else { // p2 ��
					int r = ran.nextInt(2); // ���� ���� 0 , �ٳ��� 1
					if (r == 0) { // ����
						ba2 = 0; // ���Ⱑ �ٳ��� ī�带 ����
						int r1 = ran.nextInt(5) + 1;
						st2 = r1;
						System.out.println("P2 ���� ���� : " + st2);
						p2 -= 1;
						count += 1;
						turn += 1;
					} else if( r == 1){ // �ٳ���
						st2 = 0; // �ٳ����� ���� ī�带 ����
						int r2 = ran.nextInt(5) + 1;
						ba2 = r2;
						System.out.println("P2 �ٳ��� ���� : " + ba2);
						p2 -= 1;
						count += 1;
						turn += 1;
					}
					
				}
				
				System.out.println("------------------------------------");
				System.out.println("p1 ī�� : " + p1 + " " + "p2 ī�� : " + p2 + " " + "ī�� ���� : " + count);
				System.out.println("���� : " + (st1 + st2) + " " + "�ٳ��� : " + (ba1 + ba2));
				System.out.println("------------------------------------");

				// ������ ���� ���� �� �ʱ�ȭ

				//int sum1 = st1 + st2;
				//int sum2 = ba1 + ba2;
				if (st1 + st2 == 5) { // ���� ����
					System.out.println("������ : "+st1 + " " + st2 + " " + ba1 + " " + ba2);
					int bell = ran.nextInt(2);
					System.out.println("������ �� : "+bell);
					if (bell == 0) {
						System.out.println("P1 BELL ����");
						p1 += count;
						p1 += 1;
						p2 -= 1;
						count = 0;
						st1 = 0;
						st2 = 0;
						ba1 = 0;
						ba2 = 0;
					} else if(bell == 1) {
						System.out.println("P2 BELL ����");
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
					System.out.println("�ٳ����� : "+st1 + " " + st2 + " " + ba1 + " " + ba2);
					int bell = ran.nextInt(2);
					System.out.println("�ٳ����� �� : "+bell);
					if (bell == 0 ) {
						System.out.println("P1 BELL ����");
						p1 += count;
						p1 += 1;
						p2 -= 1;
						count = 0;
						st1 = 0;
						st2 = 0;
						ba1 = 0;
						ba2 = 0;
					} else if(bell == 1 ){
						System.out.println("P2 BELL ����");
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
					System.out.println("���� : "+st1 + " " + st2 + " " + ba1 + " " + ba2);
					int bell = ran.nextInt(2);
					System.out.println("���� �� : "+bell);
					if (bell == 0 ) {
						System.out.println("P1 BELL ����");
						p1 += count;
						p1 += 1;
						p2 -= 1;
						count = 0;
						st1 = 0;
						st2 = 0;
						ba1 = 0;
						ba2 = 0;
					} else if(bell == 1 ) {
						System.out.println("P2 BELL ����");
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
					System.out.println("p2 �¸�");
					break;
				} else if (p2 <= 0) {
					System.out.println("p1 �¸�");
					break;
				}

			}
			System.out.println();
			System.out.println("[1.���] [0.����]");
			int sel = scan.nextInt();
			if(sel == 0) {
				System.out.println("����");
				break;
			}else {
				p1 = 15;
				p2 = 15;
				count = 0;
			}
		}
		

	}

}
