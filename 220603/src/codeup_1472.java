import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class codeup_1472 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=Integer.parseInt(sc.next());
		int m=Integer.parseInt(sc.next());
		
		Integer temp[]=new Integer[n*m]; //�� �� ���Ѹ�ŭ �ϳ��� �迭�� �ְ�(������������ �ְ�)
		for(int i=0;i<temp.length;i++) { //4,4 >> 1 2 3 4 5 6 ... 16
			temp[i]=i+1;
		}
		Arrays.sort(temp, Collections.reverseOrder()); //�迭�� ������ ������������ ����(�������� ����)
		// 12 11 10 9 8 ... 1
		int idx=0;
		if(n%2==1) { //��Ÿ�����ϴ� ���� ������ Ȧ�� >> �ܼ�â�� ��� ��������
			//���� > ���� > ���� > ���� �̷���
			for(int i=0;i<n;i++) {
//				if(n==1) { //����ó�� n�� 1�� ��� >> ��, �ֿܼ� ��Ÿ���� ���� ������ 1���϶�
//					Arrays.sort(temp, Collections.reverseOrder());
//					for(int j=0;j<temp.length;j++) {
//						System.out.print(temp[j]+" ");
//					}
//					break;
//				}
				//���� ���� ���� ���ο��� �Էµ� ���ڴ� ������������ ���ĵǾ��ִ� ����
				//temp = 12 11 10 9 8 7 6 5 4 3 2 1
				if(i!=0&&i%2!=0) { //��Ÿ�����ϴ� ���� ������ Ȧ���϶� + ���� �ε����� Ȧ�� >> ��������
					//i=1
					//temp�� 4���� 4����ŭ �����Ѱ� temp2
					//temp2 = 8 7 6 5
					//temp2 = 5 6 7 8
					//�ݺ������� ��� �ٹٲ�
					//idx==8
					Integer temp2[]=Arrays.copyOfRange(temp, idx, idx+m);
					Arrays.sort(temp2); //������������ ������ �ٲۻ���
					idx=idx+m;
					for(int j=0;j<temp2.length;j++) {
						System.out.print(temp2[j]+" ");
					}
					System.out.println();
				}else { //��Ÿ�����ϴ� ���� ������ Ȧ���϶� + ���� �ε����� Ȧ���̰ų� 0 �϶� >> ��������
					//i=0, i=2 (m=4)
					//i=0�϶�
					//temp�� 0���� 4����ŭ �����Ѱ� temp2
					//temp2 = 12 11 10 9
					//i=2�϶�
					//temp�� 8���� 4����ŭ �����Ѱ� temp2
					//temp2 = 4 3 2 1
					//4 3 2 1
					Integer temp2[]=Arrays.copyOfRange(temp, idx, idx+m); //temp��� �迭�� idx��� �ε��� ��ȣ���� idx+m��ŭ ����
					idx=idx+m; //idx==4
					for(int j=0;j<temp2.length;j++) {
						System.out.print(temp2[j]+" ");
					}
					System.out.println();
				}
			}
		} else {
			for(int i=0;i<n;i++) {
				if(i==0||i%2==0) {
					Integer temp2[]=Arrays.copyOfRange(temp, idx, idx+m);
					Arrays.sort(temp2);
					idx=idx+m;
					for(int j=0;j<temp2.length;j++) {
						System.out.print(temp2[j]+" ");
					}
					System.out.println();
				}else {
					Integer temp2[]=Arrays.copyOfRange(temp, idx, idx+m);
					idx=idx+m;
					for(int j=0;j<temp2.length;j++) {
						System.out.print(temp2[j]+" ");
					}
					System.out.println();
				}
			}
		}
	}
}
