package �迭_����;

import java.util.Arrays;
import java.util.Random;

public class �迭_8����_����3 {

	public static void main(String[] args) {
		/*
		 �������� ���� 5���� �����Ѵ�. (1~9������ ����)
		 �������ڰ� Ȧ���̸� arr�迭�� �տ������� ���� (��, ���Ȧ������ �ڷ� �о��.)
		 �������ڰ� ¦���̸� arr�迭�� �ڿ������� ����(��, ��� ¦������ ������ �о��.)
		 �Ʒ� �߰� ������ �����Ѵ�. 
		 [����]
			3 ==> arr = {3,0,0,0,0}; // Ȧ���� �Ǿտ� 3����
		 	1 ==> arr = {1,3,0,0,0}; // ���� ��(3)�� �ڷ� �о�� Ȧ���� �Ǿտ� 1����
		  	2 ==> arr = {1,3,0,0,2}; // ¦���� �ǵڿ� 2����
		  	6 ==> arr = {1,3,0,2,6}; // ���� ��(2)�� ������ �о�� ¦���� �ǵڿ� 6����
		  	7 ==> arr = {7,1,3,2,6}; // ���� ��(1, 3)�� �ڷ� �о�� �Ǿտ� 7���� 
		 */
		Random ran = new Random();

		int arr[] = new int[5];
		int count1 = 0;
		int count2 = 0;
		for(int i = 0 ; i< arr.length; i++) {
			int r = ran.nextInt(9)+1;
			System.out.println("r : "+r);
			if(r % 2 == 1 && arr[0] == 0) {
				arr[0] = r;
			}else if(r % 2 == 1 ) {
				count1 += 1;
				for(int j = count1; j >= 1; j--) {
					arr[j] = arr[j-1];
				}
				arr[0]= r;
				System.out.println(Arrays.toString(arr));
			}else if(r % 2 == 0 && arr[4] == 0) {
				arr[4] = r;
			}else if(r % 2 ==0) {
				count2 += 1;
				for(int j = arr.length-count2 ; j < arr.length; j++) {
					arr[j-1] = arr[j];
				}
				arr[4] = r;
				System.out.println(Arrays.toString(arr));
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
