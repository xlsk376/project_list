package ���ǹ�_����;

import java.util.Random;
import java.util.Scanner;

public class ���ǹ�4_���� {

	public static void main(String[] args) {
		/*
		[�н���ǥ]
			������ Ȱ���ؼ� ���ǹ��� �н��Ѵ�.
		[����]
		[����¦������]
			100~900 ������ �������ڸ� ����Ѵ�. -> ok
			���ڸ��� ���ڸ� ���� ���ڸ��� �и��Ѵ�.	 -> 	
		[��Ģ]
			[1] ���ڸ���� ¦���̸� "1��"�� ����Ѵ�.
			[2] ���ڸ��� ¦���̰�, ¦���μ��ڰ� �����̸� "2��"�� ����Ѵ�. 
			[3] �׿ܴ� "��"�� ����Ѵ�. 
			[4] ��, 0�� ¦���̴�.
		[����]
			462 : 4,6,2 ���ڸ� ��� ¦���̹Ƿ� "1��"
			245 : 2,4,5 ���ڸ��� ¦���̰� 2,4�����̹Ƿ� "2��"
			456 : 4,5,6                                                                                  ���ڸ��� ¦�������� ������ �ƴϹǷ� "��"
			782 : 7,8,2 ���ڸ��� ¦���̰� 8,2�����̹Ƿ� "2��" 	
		 */
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
		Random ran = new Random();
		int num = ran.nextInt(801)+100; // 0~800 +100
		System.out.println(num);
		int count = 0;
		int a = 0;
		int n100 = num/100;
		int n10 = num%100/10;
		int n1 = num%100%10;
		if(n100%2 == 0) {
			count += 1;
		}
		if(n10%2 == 0) { // 10�ڸ����� �������� �ƴ��� �Ǻ� // ¦���� +1
			count += 1; 
		}else { // Ȧ���� -1
			count -= 1;
		}
		if(n1%2 == 0) {
			count += 1;
		}
		//System.out.println(count);
		if(count == 3) {
			System.out.println("1��");
		}else if(count == 2) {
			System.out.println("2��");
		}else {
			System.out.println("��");
		}
		

	}

}
