package �ݺ���_����;

import java.util.Random;

public class �Ｎ���� {

	public static void main(String[] args) {
		/*
		[�Ｎ����]
			�������� 1�Ǵ� 7 �� 7������Ѵ�. 
			7�� �������� 3���̻��̸� "��÷" �ƴϸ� "��" ����Ͻÿ�.
		[����]
			7 7 1 1 1 7 1 : ��
			1 7 7 7 1 1 7 : ��÷
		 */
		
		Random ran = new Random();
		int win = 0;
		int count = 0;
		int a = 0;
		for(int i = 0; i < 7; i++) {
			int r = ran.nextInt(2);
			if(r == 0) {
				win = 1;
				count = 0;
			}else if(r == 1) {
				win = 7;
				count += 1;
				if(count == 3) {
					a = i;
				}
			}
			System.out.print(win + " ");
		}
		if(a != 0 ) {
			System.out.println("��÷");
		}
		

	}

}
