package �ݺ���_����;

public class ��ܼ��� {

	public static void main(String[] args) {
		/*
		 * ö���� 30��¥�� ����� �ֻ�ܿ� ���ִ�. 
		 * ���ϾƷ����� ���������� �Ѵ�. 
		 * ö���� �������� ���ʹ߷� ���� ����� ����Ͻÿ�. 
		 * �Ʒ����ǵ��� �����Ͻÿ�.
		 * [����]
		 * [1] ö���� ������ �Ѱ�ܾ� ��������. 
		 * [2] ö���� ù���� ���ʴٸ����� ����� ��������. 
		 * [3] ����� �ټ����Ҷ� ���� �ݴ���ٸ��� �ٲ㼭 ����Ͻÿ�. 5��
		 * 
		 * [����]
		 * 	29 27 25 23 21 -> Ȧ �Ѿ�� -1
		 *  20 18 16 14 12 -> ¦ �Ѿ�� -1
		 *  11 9  7  5  3  -> Ȧ �Ѿ�� -1
		 *  2			   -> ¦
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
						count = 0; // Ȧ 5�� ����� �ʱ�ȭ
					}
				}
			}else if(check == true) {
				if(i % 2 == 0) {
					System.out.print(i + " ");
					count += 1;
					if(count == 5) {
						System.out.println();
						check = false;
						count = 0; // ¦ 5�� ����� �ʱ�ȭ
					}
				}
			}
		}
		
		//������ �ڵ�
		
	}

}
