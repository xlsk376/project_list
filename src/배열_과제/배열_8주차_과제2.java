package 배열_과제;

import java.util.Arrays;
import java.util.Random;

public class 배열_8주차_과제2 {

	public static void main(String[] args) {
		/*	
	 	철수는 회사홍보를 위해 굿즈나눠주는행사를하고있다.
	 	goods 배열은 오늘 나눠줄 행사 상품 개수이다. 
	 	people 배열은 오늘 상품을 받기위해 줄서있는 사람들이다.
	 	
	 	상품은 왼쪽에서 부터 순차적으로 나눠주고
	 	줄선사람들을 다나눠주고난후에 뒤에 상품들을 전부 한칸씩 앞으로 옮겨서 나눠준다.
	 	사람들도 전부 한칸씩 앞으로 이동한다.
	 	상품을 전부 나눠준후에 goods 배열의 변화과정을 출력하시오.
	 	
	 	[예시]
	 		{39,43,27,19} 에서 30을제외하면 {9,43,27,19} 이 된다. 
	 		{9,43,27,19} 에서 9는 남은상품이므로 다음인덱스의 값인 43에 합쳐진다. {52,27,19,0}	 		 		
	 		{52,27,19,0} 에서 30을 제외하면 {22,27,19,0} 이 된다.
	 		{22,27,19,0} 에서 22는 남은상품이므로 다음인덱스의 값인 27에 합쳐진다. {49,19,0,0}
	 		{49,19,0,0} 에서 30을 제외하면 {19,19,0,0} 이 된다.
	 		{19,19,0,0} 에서 19는 남은상품이므로 다음인덱스의 값인 19와 합쳐진다. {38,0,0,0}
	 		{38,0,0,0} 에서 30을 제외하면 {8,0,0,0} 이된다.
		 */
		Random ran = new Random();
		int goods[] = { 39, 43, 27, 19 };
		int people[] = { 30, 30, 30, 30 };
		int temp = 0;
		System.out.println(Arrays.toString(goods)); // 최초 배열
		for (int i = 0; i < goods.length; i++) {
			int k = 0; 
			goods[k] -= people[k]; // 앞으로 계속 당겨지기 때문에 0에서 계산
			System.out.println(Arrays.toString(goods)); // 상품나눠준후 배열
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
			System.out.println(Arrays.toString(goods)); // 남은 상품 이동 배열
		}
		//System.out.println(Arrays.toString(goods));

	}

}
