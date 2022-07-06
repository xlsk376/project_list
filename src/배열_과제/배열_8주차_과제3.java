package 배열_과제;

import java.util.Arrays;
import java.util.Random;

public class 배열_8주차_과제3 {

	public static void main(String[] args) {
		/*
		 랜덤으로 숫자 5개를 저장한다. (1~9사이의 숫자)
		 랜덤숫자가 홀수이면 arr배열의 앞에서부터 저장 (단, 모든홀수값은 뒤로 밀어낸다.)
		 랜덤숫자가 짝수이면 arr배열의 뒤에서부터 저장(단, 모든 짝수값은 앞으로 밀어낸다.)
		 아래 추가 설명을 참고한다. 
		 [예시]
			3 ==> arr = {3,0,0,0,0}; // 홀수는 맨앞에 3저장
		 	1 ==> arr = {1,3,0,0,0}; // 전의 값(3)을 뒤로 밀어내고 홀수는 맨앞에 1저장
		  	2 ==> arr = {1,3,0,0,2}; // 짝수는 맨뒤에 2저장
		  	6 ==> arr = {1,3,0,2,6}; // 전의 값(2)를 앞으로 밀어내고 짝수는 맨뒤에 6저장
		  	7 ==> arr = {7,1,3,2,6}; // 전의 값(1, 3)을 뒤로 밀어내고 맨앞에 7저장 
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
