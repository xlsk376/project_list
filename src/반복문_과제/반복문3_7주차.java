package �ݺ���_����;

import java.util.Random;
import java.util.Scanner;

public class �ݺ���3_7���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
        �������� (1~9) ������ ����  8���� ����Ѵ�. 
        �� �Ʒ��� ������ �����Ѵ�. 
        
        ���� ��� ���ڰ� 4 5 6 1 2 3 4 5 �̶�� �Ѵٸ�
        �Ʒ��� ���� ����Ѵ�. 
        
        [���]
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
//		//��ü���� üũ�� 3ĭ���� ���ڸ����� ������ ���� ���
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
		for(int i = 0; i < 6; i++) { // ���� 8��
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
//		�ݺ����� ����ؼ� �Ʒ��� ���� ����غ�����.
//		[����]
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
