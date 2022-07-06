package 반복문_과제;

import java.util.Random;

public class 오징어게임 {

	public static void main(String[] args) {
		/*
		[오징어게임]
			철수는 오징어게임에 참가하였다.
			첫번째 게임은 "무궁화꽃이 피었습니다" 이다.
			규칙은 아래와같다.	
		[규칙]	
			[1] 전체 거리는 0 ~ 25까지 거리가 있다.
			[2] 철수는 현재 0의 자리에 있다.
			[3] 철수는 매턴 1 ~ 4의 랜덤숫자를뽑는다. 숫자만큼 이동한다. 
			[4]	이동거리를 누적하며, 합이 25이상이되면 승리이며 종료한다.
			[5] 인형은 매턴 3 ~ 5의 랜덤숫자를뽑는다. 
			[6] 인형보다 큰 숫자가나오면 움직인것으로 간주되어 패배하며 종료한다.
			[7] 10턴안에 도착못하면 시간초과로 패배하며 종료한다.
			[8] 철수의 이동경로 와 인형의 숫자를 전부 출력하시오.
		 */
		
		/*
		 *  거리 : 0 ~ 25, 철수는 현재 0
		 *  매턴 : 철수 - 1 ~ 4 랜덤 후 숫자만큼 이동
		 *  	 인형 - 3 ~ 5 랜덤 
		 *        철수 > 인형 이면 패배하여 종료
		 *  총 이동거리 25이상이면 승리
		 *  10턴안에 도착해야함
		 */
		Random ran = new Random();
		int total = 0;
		int count = 0;
		int c = 0; //철수
		int turn = 1;
		while(true) {
			int rc = ran.nextInt(4)+1; // 1 ~ 4 철수
			int rd = ran.nextInt(3)+3; // 3 ~ 5 인형
			System.out.println(turn + "턴 = "+"철수이동 : " +rc + " " + "인형이동 : "+rd);
			turn += 1;
			if(rc > rd) {
				System.out.println("패배");
				break;
			}else {
				c += rc; // 철수 이동
				count += 1;
			}
			//System.out.println(c);
			if(count <= 10) {
				if(c >= 25) {
					System.out.println("총이동거리 : "+c);
					System.out.println("승리");
					break;
				}
			}else if(count > 10) {
				System.out.println("패배");
				break;
			}
		}
		

	}

}
