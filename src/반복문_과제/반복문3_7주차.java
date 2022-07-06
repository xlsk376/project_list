package 반복문_과제;

import java.util.Random;
import java.util.Scanner;

public class 반복문3_7주차 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
        랜덤숫자 (1~9) 사이의 숫자  8개를 출력한다. 
        단 아래의 조건을 참고한다. 
        
        예를 들어 숫자가 4 5 6 1 2 3 4 5 이라고 한다면
        아래와 같이 출력한다. 
        
        [출력]
           4 5 6
           5 6 1
           6 1 2
           1 2 3
           2 3 4
           3 4 5 
		 */
		Random ran = new Random();
//		int count = 0;
//		int a = 0;
//		int b = 0;
//		int c = 0;
//		int d = 0;
//		int e = 0;
//		int f = 0;
//		int g = 0;
//		int h = 0;
//		
//		//전체숫자 체크후 3칸마다 앞자리수를 제외한 수를 출력
//		for(int i = 0; i < 8; i++) {
//			int r = ran.nextInt(9)+1;
//			System.out.print(r + " ");
//			if(count == 0) {
//				a = r;
//			}else if(count == 1) {
//				b = r;
//			}else if(count == 2) {
//				c = r;
//			}else if(count == 3) {
//				d = r;
//			}else if(count == 4) {
//				e = r;
//			}else if(count == 5) {
//				f = r;
//			}else if(count == 6) {
//				g = r;
//			}else if(count == 7) {
//				h = r;
//			}
//			count += 1;
//		}
//		System.out.println();
//		System.out.println(a + " " + b + " "+ c + " "+ d + " "+ e + " "+ f + " "+ g + " "+ h);
//		System.out.println();
//		for(int i = 0; i < 6; i++) {
//			if(i == 0) {
//				System.out.println(a + " " + b + " "+ c);
//			}else if(i == 1) {
//				System.out.println(b + " " + c + " "+ d);
//			}else if(i == 2) {
//				System.out.println(c + " " + d + " "+ e);
//			}else if(i == 3) {
//				System.out.println(d + " " + e + " "+ f);
//			}else if(i == 4) {
//				System.out.println(e + " " + f + " "+ g);
//			}else if(i == 5) {
//				System.out.println(f + " " + g + " "+ h);
//			}
//		}
		
		int a = 0;
		int b = 0;
		int c = 0;
		int temp = 0;
		int count = 0;
		for(int i = 0; i < 6; i++) { // 숫자 8개
			for(int j = 0; j < 3; j++) {
				int r = ran.nextInt(9)+1; // 1~9
				if( i == 0 && j == 0) {
					a = r;
				}else if(i == 0 && j == 1) {
					b = r;
				}else if(i == 0 && j == 2) {
					c = r;
				}else if(i == 1 ) {
					a = b;
					b = c;
					c = r;
					break;
				}else if(i == 2 ) {
					a = b;
					b = c;
					c = r;
					break;
				}else if(i == 3) {
					a = b;
					b = c;
					c = r;
					break;
				}else if(i == 4) {
					a = b;
					b = c;
					c = r;
					break;
				}else if(i == 5) {
					a = b;
					b = c;
					c = r;
					break;
				}
			}
			System.out.println(a + " " + b + " "+ c);
		}
		//System.out.println(a + " " + b + " "+ c);
		
		
		
//		/*
//		반복문을 사용해서 아래와 같이 출력해보세요.
//		[예시]
//			0 1 2
//			1 2 3
//			2 3 4
//			3 4 5
//			4 5 6
//	 	*/
//		int index1 = 1;
//		int index2 = 2;
//		for(int i = 0; i < 5; i++) {
//			System.out.println(i + " " + index1 + " " + index2);
//			index1 += 1;
//			index2 += 1;
//		}
		
		
	}

}
