import java.util.Scanner;

public class codeup_1484 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); //����
		int b = sc.nextInt(); //����
		int[][] c = new int[a][b];
		int i=0, j=-1, n=0 ,t=1;
		int a2=a, b2=b;

		while(true) { //����Ŭ�� 1.�� 2.�� + 3.�� 4.��
			for (int l=0;l<b;l++) { //���� �� ��
				n+=1;
				j+=t;
				c[i][j] = n;
			}
			a--; //���� ���� ä���⶧���� ���� 1�� �� ä�� -1
			
			for (int l=0;l<a;l++) { //���� �� ��
				n++;
				i+=t;
				c[i][j] = n;
			}
			b--; //���� ���� ä���� ������ ���� 1�� �� ä�� -1
			
			t*=-1; //���� ��ȯ
			
			if(a<=0||b<=0) { //�� �̻� ä��� ���� ���� �Ǵ� ���� ������ Ż��
				break; 
			}
		}
			
		for (int l=0;l<a2;l++) {
			for (int k=0;k<b2;k++) {
				System.out.print(c[l][k] +" ");
			}
			System.out.println();
		}
	}
}
