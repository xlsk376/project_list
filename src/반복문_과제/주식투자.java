package �ݺ���_����;

import java.util.Random;

public class �ֽ����� {

	public static void main(String[] args) {
		/*
		ö���� ���� �ֽĿ� ������ ���̱� �����ߴ�. 
		�ֽ��� ��°�� �ñ��ϱ� �����ߴ�. 
		�ֱ� �����ִ� �����ֽ��� ���캸��� �ߴ�.
		������ ����ϴ� �Ⱓ�� ���� �� �Ⱓ�� ����غ���. 
	 	[1] �������� 1~8���� ���� 10���� ���������� ����Ѵ�. 
	  	[2] �������ڴ� �ְ� ��ġ�� ���ϰ�  ���ڰ�ũ�� ��� ������ �϶��̴�. 
	  	[����] �Ʒ��Ͱ��� �������ڰ� ���Դٰ��ϸ�
	  		4 8 3 2 6 7 4 5 6 1
	  		
	  		(1) ó�� 4 - 8 �� ����̰� 8 ������ 3 �̱⶧���� �ִ� ��±Ⱓ�� 1�̴�.
	  		(2) �ٽ� 2 - 6 - 7 �� ����̰� ���� 4�̱� ������ �ִ��±Ⱓ�� 2�̴�. 
	  		(3) 4 - 5 - 6 �� ����̰�  6 ���� 1�̱⶧���� �ִ��±Ⱓ�� 2�̴�.   
	  	[����]
	  		2��
		 */
		
		Random ran = new Random();
		int b = 0; // ���ǰ�
		int f = 0; // ���ǰ�
		int count = 0;
		int temp = 0;
		for(int i = 0; i < 10; i++) {
			int r = ran.nextInt(8)+1;
			System.out.print(r + " ");
			if(i == 0) {
				b = r;
				//System.out.print("["+b+"]");
			}else {
				f = r;
				//System.out.print("[����"+f +"] ");
				if(b < f) { // max ��, ���
					count += 1;
					b = f;
					System.out.print(" ["+count+"] ");
				}else if (b > f){ // min ��, �϶�
					b = f;
					count = 0;
				}
				if(temp < count) {
					temp = count; // �ִ� ���
				}
			}
		}
		System.out.println();
		System.out.println(temp);

	}

}
