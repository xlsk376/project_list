package �ݺ���_����;

public class ��ܼ���2 {

	public static void main(String[] args) {
		/*
		����� 50 ����� �ִ�. ö���� ���� ����ܿ� ���ִ�. 
		ö���� �ѹ��� �ΰ�ܾ� ��������. 
		ö���� �޹߷� ��� ����� ����Ͻÿ�.
		�Ʒ������� �����Ͻÿ�.
		[1] ö���� �ѹ��� �ΰ�ܾ� ��������.
		[2] ö���� ���ʹߺ��� ��������.
		[3] 5������Ҷ����� �ٸ� ���� ����Ͻÿ�.
		
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
				i = i-2; // 5��° ������ -2
				System.out.println();
				System.out.print(i + " "); // 
				count += 1; // ī��Ʈ�� 1���� ���ڶ�� �Ǳ� ������ +1�� ���ش�.
			}
		}
		
//		
//		int pos = 50;
//		int count = 0;
//		int turn = 1; //1: �޹�  // 2: ������ 
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
