import java.util.ArrayList;
import java.util.Scanner;

public class codeup_1226 {
	public static void main(String[] args) {
		ArrayList<Integer> lotto=new ArrayList<Integer>();
		ArrayList<Integer> Mylotto=new ArrayList<Integer>();
		int count=0;
		int bonus=0;
		String result="";
		while(true) {
			lotto.add((int)((Math.random()*45)+1));
			lotto.add((int)((Math.random()*45)+1));
			lotto.add((int)((Math.random()*45)+1));
			lotto.add((int)((Math.random()*45)+1));
			lotto.add((int)((Math.random()*45)+1));
			lotto.add((int)((Math.random()*45)+1));
			lotto.add((int)((Math.random()*45)+1));
			if(lotto.get(0)!=lotto.get(1)&&lotto.get(0)!=lotto.get(2)&&lotto.get(0)!=lotto.get(3)&&lotto.get(0)!=lotto.get(4)&&lotto.get(0)!=lotto.get(5)&&lotto.get(0)!=lotto.get(6)) {
				break;
			}
		}
		Scanner in=new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		while(true) {
			try {
				System.out.println("ù��° ���ڸ� �Է��ϼ���");
				a=Integer.parseInt(in.nextLine());
				if(a<1||a>45) {
					throw new Exception("���� : 1~45������ ���ڸ� �Է��ϼ���");
				}
				System.out.println("�ι�° ���ڸ� �Է��ϼ���");
				b=Integer.parseInt(in.nextLine());
				if(b<1||b>45) {
					throw new Exception("���� : 1~45������ ���ڸ� �Է��ϼ���");
				}
				if(a==b) {
					throw new Exception("���� : ������ ���ڸ� �Է��� �� �����ϴ�");
				}
				System.out.println("����° ���ڸ� �Է��ϼ���");
				c=Integer.parseInt(in.nextLine());
				if(c<1||c>45) {
					throw new Exception("���� : 1~45������ ���ڸ� �Է��ϼ���");
				}
				if(c==a||c==b) {
					throw new Exception("���� : ������ ���ڸ� �Է��� �� �����ϴ�");
				}
				System.out.println("�׹�° ���ڸ� �Է��ϼ���");
				d=Integer.parseInt(in.nextLine());
				if(d<1||d>45) {
					throw new Exception("���� : 1~45������ ���ڸ� �Է��ϼ���");
				}
				if(d==a||d==b||d==c) {
					throw new Exception("���� : ������ ���ڸ� �Է��� �� �����ϴ�");
				}
				System.out.println("�ټ���° ���ڸ� �Է��ϼ���");
				e=Integer.parseInt(in.nextLine());
				if(e<1||e>45) {
					throw new Exception("���� : 1~45������ ���ڸ� �Է��ϼ���");
				}
				if(e==a||e==b||e==c||e==d) {
					throw new Exception("���� : ������ ���ڸ� �Է��� �� �����ϴ�");
				}
				System.out.println("������° ���ڸ� �Է��ϼ���");
				f=Integer.parseInt(in.nextLine());
				if(f<1||f>45) {
					throw new Exception("���� : 1~45������ ���ڸ� �Է��ϼ���");
				}
				if(f==a||f==b||f==c||f==d||f==e) {
					throw new Exception("���� : ������ ���ڸ� �Է��� �� �����ϴ�");
				}
				Mylotto.add(a);
				Mylotto.add(b);
				Mylotto.add(c);
				Mylotto.add(d);
				Mylotto.add(e);
				Mylotto.add(f);
				break;
			}
			catch(NumberFormatException err) {
				System.out.println("���ڸ� �Է��ϼ���");
			}
			catch(Exception err) {
				System.out.println(err.getMessage());
			}
		}
		System.out.println("�̹� �� ��÷��ȣ : "+lotto.toString());
		System.out.println("���� �ζǹ�ȣ : "+Mylotto.toString());
		for(int i=0;i<Mylotto.size();i++) {
			if(Mylotto.get(i)==lotto.get(0)) {
				count+=1;
			}
			if(Mylotto.get(i)==lotto.get(1)) {
				count+=1;
			}
			if(Mylotto.get(i)==lotto.get(2)) {
				count+=1;
			}
			if(Mylotto.get(i)==lotto.get(3)) {
				count+=1;
			}
			if(Mylotto.get(i)==lotto.get(4)) {
				count+=1;
			}
			if(Mylotto.get(i)==lotto.get(5)) {
				count+=1;
			}
			if(Mylotto.get(i)==lotto.get(6)) {
				bonus+=1;
			}
		}
		if(count==6) {
			result="1��";
		}
		if(count==5&&bonus==1) {
			result="2��";
		}
		if(count==5&&bonus==0) {
			result="3��";
		}
		if(count==4) {
			result="4��";
		}
		if(count==3) {
			result="5��";
		}
		if(count<=2) {
			result="��";
		}
		System.out.println("���� ��÷��� : "+result);
	}
}
