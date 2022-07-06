package 반복문_과제;

import java.util.Random;

public class 즉석복권 {

	public static void main(String[] args) {
		/*
		[즉석복권]
			랜덤으로 1또는 7 을 7번출력한다. 
			7이 연속으로 3번이상이면 "당첨" 아니면 "꽝" 출력하시오.
		[예시]
			7 7 1 1 1 7 1 : 꽝
			1 7 7 7 1 1 7 : 당첨
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
			System.out.println("당첨");
		}
		

	}

}
