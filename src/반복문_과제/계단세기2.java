package 반복문_과제;

public class 계단세기2 {

	public static void main(String[] args) {
		/*
		계단이 50 계단이 있다. 철수는 제일 윗계단에 서있다. 
		철수는 한번에 두계단씩 내려간다. 
		철수가 왼발로 디딘 계단을 출력하시오.
		아래조건을 참고하시오.
		[1] 철수는 한번에 두계단씩 내려간다.
		[2] 철수는 왼쪽발부터 내려간다.
		[3] 5번출력할때마다 다른 발을 출력하시오.
		
		48 44 40 36 32 
		30 26 22 18 14
		12 8  4
		 */		
		int count = 0;
		for(int i = 48; i > 0; i-=4) {
			System.out.print(i + " ");
			count += 1;
			//System.out.println(count);
			if(count % 5 == 0) {
				i = i-2; // 5번째 수마다 -2
				System.out.println();
				System.out.print(i + " "); // 
				count += 1; // 카운트가 1개씩 모자라게 되기 때문에 +1씩 해준다.
			}
		}
		
//		
//		int pos = 50;
//		int count = 0;
//		int turn = 1; //1: 왼발  // 2: 오른발 
//		while(pos > 1) {
//			if(count == 0 || count == 5) {
//				pos -= 2;
//				count += 1;
//				System.out.print(pos + " ");
//			}else {
//				pos -= 4;
//				if (turn == 1) {
//					if(pos != 0) {
//						System.out.print(pos + " ");
//					}
//					count += 1;
//					if(count == 5) {
//						System.out.println();
//						count = 0;
//						turn = 2;
//					}
//					if(pos == 0) {
//						System.out.println(" ");
//					}
//				}else if(turn == 2) {
//					System.out.print(pos + " ");
//					count += 1;
//					if(count == 5) {
//						System.out.println();
//						count = 0;
//						turn = 1;
//					}
//				}		
//			}
//		}

	}

}
