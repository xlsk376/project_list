package ���ǹ�_����;

import java.util.Random;
import java.util.Scanner;

public class ���ǹ�5_����01_�����������ϳ����� {

	public static void main(String[] args) {
		/*	
		[����]
		[���������� �ϳ�����]
		[1] ���� ���� ���ϰ� ������ �ִ��� ����ϰ� �����ÿ�.
		 */
		// ������������ ���� �ϳ�����
		// ���� 0; ���� 1; �� 2;
		int count = 0;
		int ���� = 0;
		int ���� = 1;
		int �� =2;
		int com = 0;
		int me = 0;
		Random ran = new Random();
		int com1 = ran.nextInt(3); // ����������
		int com2 = ran.nextInt(3); // ����������
		int comRandom = ran.nextInt(2); //�������̳� �޼��߿� ����
		System.out.println("�޼� : "+com1);
		System.out.println("������ : "+com2);
		if(comRandom == 0) {
			System.out.println("�޼ռ���");
			com = com1;
		}else {
			System.out.println("�����ռ���");
			com = com2;
		}
		System.out.println("������ �� : "+com);
		System.out.println();
		int me1 = ran.nextInt(3); // ����������
		int me2 = ran.nextInt(3); // ����������
		int meRandom = ran.nextInt(2); //�������̳� �޼��߿� ����
		System.out.println("�޼� : "+me1);
		System.out.println("������ : "+me2);
		if(meRandom == 0) {
			System.out.println("�޼ռ���");
			me = me1;
		}else {
			System.out.println("�����ռ���");
			me = me2;
		}
		System.out.println("������ �� : "+me);
		if(me == com) {
			System.out.println("���");
		}else if(me == 0 && com == 2) { // ���� 0; ���� 1; �� 2;
			System.out.println("�����̱�");
		}else if(me == 1 && com == 0) {
			System.out.println("�����̱�");
		}else if(me == 2 && com == 1) {
			System.out.println("�����̱�");
		}else {
			System.out.println("������");
		}

		
		

	}

}
