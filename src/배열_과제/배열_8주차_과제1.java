package 배열_과제;

import java.util.Arrays;
import java.util.Random;

public class 배열_8주차_과제1 {

	public static void main(String[] args) {
		/*
		[문제]
			5사이즈 배열에 (0~9)사이의 값을 5개를 랜덤으로 저장한다.
			배열의 각각의 값들중 홀수만 모아서 하나의 숫자로 표현하려고한다. 
			하나의 숫자로표현 후 그수의 두배를 출력
		
		(예시) 
			arr ==> { 1,4,5,4,0 } ==> 에서 홀수만 모으면 숫자15 라고생각하고, 두배인 30을출력
		[정답]
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
//				System.out.println("2배 : " + (total*2));
//			}else if(temp[3] != 0 ) {
//				temp[0] = temp[0]*1000;
//				temp[1] = temp[1]*100;
//				temp[2] = temp[2]*10;
//				total = temp[0] + temp[1] + temp[2] + temp[3];
//				System.out.println(total);
//				System.out.println("2배 : " + (total*2));
//			}else if(temp[2] != 0 ) {
//				temp[0] = temp[0]*100;
//				temp[1] = temp[1]*10;
//				total = temp[0] + temp[1] + temp[2];
//				System.out.println(total);
//				System.out.println("2배 : " + (total*2));
//			}else if(temp[1] != 0 ) {
//				temp[0] = temp[0]*10;
//				total = temp[0] + temp[1];
//				System.out.println(total);
//				System.out.println("2배 : " + (total*2));
//			}else if(temp[0] != 0) {
//				total = temp[0];
//				System.out.println(total);
//				System.out.println("2배 : " + (total*2));
//			}
		
		

	}

}
