import java.util.Scanner;

public class backjun_7_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int n=Integer.parseInt(sc.next());
		int count=1; // ���� ����(���� ����=1)
		int range=2; // ���� ���� �ּҰ�
 
		sc.close();
		
		if (n==1) {
			System.out.print(1);
		} else {
			while (range<=n) { //�Է��� ���� �ش� ������ �ּҰ��� �� >> true �̸� �Ʒ� ������ ����
				range=range+(6*count); // ���� ���� �ּҰ����� �ʱ�ȭ
				count++; //���� 1����
			}
			System.out.print(count);
		}
	}

}
