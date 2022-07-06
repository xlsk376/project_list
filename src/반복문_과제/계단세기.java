package 반복문_과제;

public class 계단세기 {

	public static void main(String[] args) {
		/*
		 * 철수는 30개짜리 계단의 최상단에 서있다. 
		 * 제일아래까지 내려가려고 한다. 
		 * 철수가 내려갈때 왼쪽발로 밟은 계단을 출력하시오. 
		 * 아래조건들을 참고하시오.
		 * [조건]
		 * [1] 철수는 무조건 한계단씩 내려간다. 
		 * [2] 철수는 첫발은 왼쪽다리부터 계단을 내려간다. 
		 * [3] 출력을 다섯번할때 마다 반대편다리로 바꿔서 출력하시오. 5번
		 * 
		 * [예시]
		 * 	29 27 25 23 21 -> 홀 넘어갈땐 -1
		 *  20 18 16 14 12 -> 짝 넘어갈땐 -1
		 *  11 9  7  5  3  -> 홀 넘어갈땐 -1
		 *  2			   -> 짝
		 */
		int count = 0;
		boolean check = false;
		for(int i = 30; i >= 1; i--) {
			if(check == false) {
				if(i % 2 == 1) {
					System.out.print(i + " ");
					count += 1;
					if(count == 5) {
						System.out.println();
						check = true;
						count = 0; // 홀 5번 출력후 초기화
					}
				}
			}else if(check == true) {
				if(i % 2 == 0) {
					System.out.print(i + " ");
					count += 1;
					if(count == 5) {
						System.out.println();
						check = false;
						count = 0; // 짝 5번 출력후 초기화
					}
				}
			}
		}
		
		//선생님 코딩
		
	}

}
