import java.util.Scanner;

public class backjun_7_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(); //ã���� �ϴ� �м� ��ȣ
		int cnt=0; //�м��� ���� ����
		int n=0; //�� ��ȣ
		sc.close();
		while (true) {
			n++;
			cnt+=n;
			if(cnt>=a) {
				if(n%2==0) {
					System.out.println(a-cnt+n+"/"+(cnt+1-a));
					//���� : �ش� ���� ���� + �ε��� - �ش� ���� �ִ밪 // 1���� �ش� ���� �������� +1 �Ǵ� ����
					//�и� : �ش� ���� �ִ밪 + 1 - �ε��� //�ش� ���� �������� 1���� -1�Ǵ� ����
				}else {
					System.out.println((cnt+1-a)+"/"+(a-cnt+n));
				}
				break;
			}
		}
	}
}
