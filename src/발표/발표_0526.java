package ��ǥ;

import java.util.Random;

public class ��ǥ_0526 {

	public static void main(String[] args) {
		/*
		 *  [369����]
		 * 1. 1~50���� �ݺ��� �Ѵ�.
		 * 2. �� �ȿ��� �ش� ������ 369������ ����� ����Ѵ�.
		 * 
		 * 3. ������ ���ڿ� 3�̳� 6�̳� 9�� �ΰ� �� "¦¦"
		 * 4. ������ ���ڿ� 3�̳� 6�̳� 9�� �Ѱ� �� "¦"
		 * 5. 3�̳� 6�̳� 9�� ������ �׳� ������� 
		 * 
		 * ��) 1 2 ¦ 4 5 ¦ 7 8 ¦ 10 11 12 ¦ ...
		 */
		
		int i = 1;
		while(i <= 50) {
			int a = i / 10;
			int b = i % 10;
			int count = 0;
			if(a == 3 || a == 6 || a == 9) {
				count += 1;
			}
			if(b == 3 || b == 6 || b == 9) {
				count += 1;
			}
			if(count == 2) {
				System.out.println("¦¦");
			}else if(count == 1) {
				System.out.println("¦");
			}else {
				System.out.println(i);
			}
			
			i+= 1;
		}
		
		
		
		

	}

}
