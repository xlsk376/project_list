package �迭_����;

import java.util.Arrays;
import java.util.Random;

public class �迭_8����_����2 {

	public static void main(String[] args) {
		/*	
	 	ö���� ȸ��ȫ���� ���� ������ִ���縦�ϰ��ִ�.
	 	goods �迭�� ���� ������ ��� ��ǰ �����̴�. 
	 	people �迭�� ���� ��ǰ�� �ޱ����� �ټ��ִ� ������̴�.
	 	
	 	��ǰ�� ���ʿ��� ���� ���������� �����ְ�
	 	�ټ�������� �ٳ����ְ��Ŀ� �ڿ� ��ǰ���� ���� ��ĭ�� ������ �Űܼ� �����ش�.
	 	����鵵 ���� ��ĭ�� ������ �̵��Ѵ�.
	 	��ǰ�� ���� �������Ŀ� goods �迭�� ��ȭ������ ����Ͻÿ�.
	 	
	 	[����]
	 		{39,43,27,19} ���� 30�������ϸ� {9,43,27,19} �� �ȴ�. 
	 		{9,43,27,19} ���� 9�� ������ǰ�̹Ƿ� �����ε����� ���� 43�� ��������. {52,27,19,0}	 		 		
	 		{52,27,19,0} ���� 30�� �����ϸ� {22,27,19,0} �� �ȴ�.
	 		{22,27,19,0} ���� 22�� ������ǰ�̹Ƿ� �����ε����� ���� 27�� ��������. {49,19,0,0}
	 		{49,19,0,0} ���� 30�� �����ϸ� {19,19,0,0} �� �ȴ�.
	 		{19,19,0,0} ���� 19�� ������ǰ�̹Ƿ� �����ε����� ���� 19�� ��������. {38,0,0,0}
	 		{38,0,0,0} ���� 30�� �����ϸ� {8,0,0,0} �̵ȴ�.
		 */
		Random ran = new Random();
		int goods[] = { 39, 43, 27, 19 };
		int people[] = { 30, 30, 30, 30 };
		int temp = 0;
		System.out.println(Arrays.toString(goods)); // ���� �迭
		for (int i = 0; i < goods.length; i++) {
			int k = 0; 
			goods[k] -= people[k]; // ������ ��� ������� ������ 0���� ���
			System.out.println(Arrays.toString(goods)); // ��ǰ�������� �迭
			int index = 0;
			for (int j = 0; j < 3; j++) {
				goods[index] += goods[j + 1];
				// System.out.println(goods[index]);
				goods[j + 1] = 0;
				people[index] = people[j + 1];
				people[j + 1] = 0;
				index += 1;
				// System.out.println(Arrays.toString(goods));
				// System.out.println(Arrays.toString(people));
			}
			System.out.println(Arrays.toString(goods)); // ���� ��ǰ �̵� �迭
		}
		//System.out.println(Arrays.toString(goods));

	}

}
