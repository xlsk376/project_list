package �ݺ���_����;

import java.util.Random;
import java.util.Scanner;

public class ����� {

	public static void main(String[] args) {
		/*
		 * ����� ������������ �ѵ� �̱��ʿ��� ������������ �ϳ��� �� ������ �̱��� �¸�, �ٸ��� ���������� ��Ȳ�� ���� �ٽ� ���� ����
		 * 
		 */
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);

		int i = 0;
		int a = 0; // ����
		int b = 1; // ����
		int c = 2; // ��
		int turn = 1;
		int win = 0;
		
		while(true) {
			System.out.println("����������(����0, ����1, ��2)");
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
				if(win % 2 == 1) { // me�̱��� a
					System.out.println("me�� �����");
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
						System.out.println("me �¸�");
						break;
					}else {
						win += 1; //com ��
					}
				}else if(win % 2 == 0) { //com�̱���
					System.out.println("com�� �����");
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
						System.out.println("com �¸�");
						break;
					}else {
						win += 1; //me ��
					}
				}
			}break;
			
		}

	}

}
