package ��ǥ;

import java.util.Arrays;
import java.util.Scanner;

public class ��ǥ_0609 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//�迭 ȸ��
		// 4 3 2 1
		// 1ȸ�� = 1 4 3 2
		// 2ȸ�� = 2 1 4 3
		//      ...
		int arr[] = {4,3,2,1};
		System.out.println(Arrays.toString(arr));
		
		while(true) {
			System.out.println("ȸ�� Ƚ�� : ");
			int c = scan.nextInt();
			for(int i = 0; i < c; i++) { // �Է��� Ƚ����ŭ �ݺ�
				int temp = arr[3];
				arr[3] = arr[2];
				arr[2] = arr[1];
				arr[1] = arr[0];
				arr[0] = temp;
			}
			if(c == 0) {
				break;
			}else {
				System.out.println(Arrays.toString(arr));
			}
		}
//				for(int j = 2; j >= 0; j--) {
//					arr[j+1] = arr[j];
//				}

	}

}
