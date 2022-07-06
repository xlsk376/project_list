package 배열_과제;

import java.util.Arrays;
import java.util.Random;

public class 배열_9주차_과제1 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		/*
		철수는 철수의마블게임을 개발중이다. 
		map1과 map2 는 게임스테이지를 표현한다. 
		숫자1은 철수의 위치이다. 
		주사위는 1~6까지 있고 주사위 2개를 던저서 그합만큼 앞으로 이동한다. 
		
		총 5번 반복하고 변화된 철수의 위치출력 
		map1의 끝에 도달하면 map2로이동해서 전진하고, 
		map2 의 끝에 도달하면 다시 map1 로 이동해서 전진한다. 
		
		[예시]
			주사위 3 , 5 ==> 8
			int map1[] = {0,0,0,0,0,0,0,0,1,0};
			int map2[] = {0,0,0,0,0,0,0,0,0,0};
			
			주사위 2 , 1 ==> 3
			int map1[] = {0,0,0,0,0,0,0,0,0,0};
			int map2[] = {0,1,0,0,0,0,0,0,0,0};
			
			주사위 6 , 1 ==> 7
			int map1[] = {0,0,0,0,0,0,0,0,0,0};
			int map2[] = {0,0,0,0,0,0,0,0,1,0};
			
			주사위 3 , 3 ==> 6
			int map1[] = {0,0,0,0,1,0,0,0,0,0};
			int map2[] = {0,0,0,0,0,0,0,0,0,0};
			
		
		 */
		int map1[] = {1,0,0,0,0,0,0,0,0,0};
		int map2[] = {0,0,0,0,0,0,0,0,0,0};
		
		int index = 0;
		int turn = 1;
		int me = 0;
		int sum = 0;
		for(int i = 0; i < 5; i++) { //5회 반복
			System.out.println(Arrays.toString(map1));
			System.out.println(Arrays.toString(map2));
			int r1 = ran.nextInt(5)+1;
			int r2 = ran.nextInt(5)+1;
			System.out.println(r1 + " " + r2);
			sum = r1 + r2;
			System.out.println(me);
			if(turn % 2 == 1) {
				map1[me] = 0;
				me += sum;
				if(me >= map1.length) {
					me -= map1.length;
					map2[me] = 1;
					map1[me] = 0;
					turn += 1;
				}else {
					map1[me] = 1;
				}
			}else {
				map2[me] = 0;
				me += sum;
				if(me >= map2.length) {
					me -= map2.length;
					map1[me] = 1;
					map2[me] = 0;
					turn += 1;
				}else {
					map2[me] = 1;
				}
			}
		}
		System.out.println(Arrays.toString(map1));
		System.out.println(Arrays.toString(map2));

		
		
		
		
		
	}

}
