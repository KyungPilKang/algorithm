import java.util.Scanner;

public class backjun_7_4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=Integer.parseInt(sc.next()); //��ħ�� �ö󰡴� �Ÿ� 2
		int b=Integer.parseInt(sc.next()); //���ῡ �������� �Ÿ�
		int v=Integer.parseInt(sc.next()); //�� ����
		int d=0; //��¥
		int v_mor=0; //��ħ�� �ö󰡰� �� ����
		int v_nig=0; //���ῡ �������� �� ����
		sc.close();
		while(true) {
			d++; //��¥�� +1
			//�ֳ� ������ �ߴٴ� �Ҹ��� ��¥�� �ּ� �Ϸ� �ɷȴٴ� �Ҹ�
			//������ �� �� �ۿ� ���� ������
			//�ö󰡴� �Ÿ��� �ּҰ��� 1�̰�, �� ���̵� �ּҰ��� 1�̱⶧����
			//��, ��� �ּҰ��� 1�̱⶧���� ��¥�� �ּҰ��� 1
			v_mor=v_nig+a; //0+2=2(d=1)
			//1+2=3(d=2)
			//2+2=4(d=3)
			//3+2=5(d=4)
			
			//��ħ�� �ö󰡰� ����
			//���ῡ �ö� �� ���� + ��ħ�� �ö󰡴� �Ÿ� = ��ħ�� �ö� �� ����
			if(v_mor>=v) { //��ħ�� �ö󰡰� �� ���� ���̰� �� ���̺��� ���ų� ũ��
				//���̻� �ö� �ʿ䰡���� ��, �� �ö󰬴ٴ� �Ҹ�
				//break
				System.out.println(d); //�� ��¥�� ����ָ� ��
				break;
			}
			//�ش����������� �����̴� ��������.
			
			v_nig=v_mor-b; 
			//���ῡ ������ �� ���� //2-1=1(d=1)
			//3-1=2(d=2)
			//4-1=3(d=3)
			
			//��ħ�� �ö� �� ���� + ���ῡ �������� �Ÿ� = ���ῡ ������ �� ����
			
//			if(v_nig>=v) {
//				System.out.println(d);
//				break;
//			}
		}
		
	}
}
