import java.util.Scanner;

public class backjun_7_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fc=Integer.parseInt(sc.next());
		int vc=Integer.parseInt(sc.next());
		int price=Integer.parseInt(sc.next());
		sc.close();
		//���ͺб���
		//������� <= (��ǰ�� ���� - ������� = ������) * ��ǰ�� ����
		//���ͺб����� �������� �ʴ´�
		//�ȼ��� ���ظ� ����
		//���� < ������� 
		
		if(vc>=price) {
			System.out.println(-1);
		} else { //����
			//�������/(��ǰ����-�������) = ��ǰ�� ���� + 1
			//�������� ���ϴ� ���ͺб���
			System.out.println((fc/(price-vc)+1));
		}
	}
}
