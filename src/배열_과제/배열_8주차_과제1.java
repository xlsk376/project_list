package �迭_����;

import java.util.Arrays;
import java.util.Random;

public class �迭_8����_����1 {

	public static void main(String[] args) {
		/*
		[����]
			5������ �迭�� (0~9)������ ���� 5���� �������� �����Ѵ�.
			�迭�� ������ ������ Ȧ���� ��Ƽ� �ϳ��� ���ڷ� ǥ���Ϸ����Ѵ�. 
			�ϳ��� ���ڷ�ǥ�� �� �׼��� �ι踦 ���
		
		(����) 
			arr ==> { 1,4,5,4,0 } ==> ���� Ȧ���� ������ ����15 �������ϰ�, �ι��� 30�����
		[����]
			30
		 */ 
		
		Random ran = new Random();
		int arr[] = new int[5];
		int temp[] = new int[5];
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(10); // 0~9
		}
		System.out.println(Arrays.toString(arr));
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 1) {
				temp[index] = arr[i];
				index += 1;
			}
		}
		System.out.println(Arrays.toString(temp));
		int total = 0;
		
//			if(temp[4] != 0) {
//				temp[0] = temp[0]*10000;
//				temp[1] = temp[1]*1000;
//				temp[2] = temp[2]*100;
//				temp[3] = temp[3]*10;
//				total = temp[0] + temp[1] + temp[2] + temp[3]+temp[4];
//				System.out.println(total);
//				System.out.println("2�� : " + (total*2));
//			}else if(temp[3] != 0 ) {
//				temp[0] = temp[0]*1000;
//				temp[1] = temp[1]*100;
//				temp[2] = temp[2]*10;
//				total = temp[0] + temp[1] + temp[2] + temp[3];
//				System.out.println(total);
//				System.out.println("2�� : " + (total*2));
//			}else if(temp[2] != 0 ) {
//				temp[0] = temp[0]*100;
//				temp[1] = temp[1]*10;
//				total = temp[0] + temp[1] + temp[2];
//				System.out.println(total);
//				System.out.println("2�� : " + (total*2));
//			}else if(temp[1] != 0 ) {
//				temp[0] = temp[0]*10;
//				total = temp[0] + temp[1];
//				System.out.println(total);
//				System.out.println("2�� : " + (total*2));
//			}else if(temp[0] != 0) {
//				total = temp[0];
//				System.out.println(total);
//				System.out.println("2�� : " + (total*2));
//			}
		
		

	}

}
