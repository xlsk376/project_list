package 발표;

import java.util.Arrays;
import java.util.Scanner;

public class 발표_0609 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//배열 회전
		// 4 3 2 1
		// 1회전 = 1 4 3 2
		// 2회전 = 2 1 4 3
		//      ...
		int arr[] = {4,3,2,1};
		System.out.println(Arrays.toString(arr));
		
		while(true) {
			System.out.println("회전 횟수 : ");
			int c = scan.nextInt();
			for(int i = 0; i < c; i++) { // 입력한 횟수만큼 반복
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
