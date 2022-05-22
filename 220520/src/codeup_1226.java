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
				System.out.println("첫번째 숫자를 입력하세요");
				a=Integer.parseInt(in.nextLine());
				if(a<1||a>45) {
					throw new Exception("오류 : 1~45사이의 숫자를 입력하세요");
				}
				System.out.println("두번째 숫자를 입력하세요");
				b=Integer.parseInt(in.nextLine());
				if(b<1||b>45) {
					throw new Exception("오류 : 1~45사이의 숫자를 입력하세요");
				}
				if(a==b) {
					throw new Exception("오류 : 동일한 숫자를 입력할 수 없습니다");
				}
				System.out.println("세번째 숫자를 입력하세요");
				c=Integer.parseInt(in.nextLine());
				if(c<1||c>45) {
					throw new Exception("오류 : 1~45사이의 숫자를 입력하세요");
				}
				if(c==a||c==b) {
					throw new Exception("오류 : 동일한 숫자를 입력할 수 없습니다");
				}
				System.out.println("네번째 숫자를 입력하세요");
				d=Integer.parseInt(in.nextLine());
				if(d<1||d>45) {
					throw new Exception("오류 : 1~45사이의 숫자를 입력하세요");
				}
				if(d==a||d==b||d==c) {
					throw new Exception("오류 : 동일한 숫자를 입력할 수 없습니다");
				}
				System.out.println("다섯번째 숫자를 입력하세요");
				e=Integer.parseInt(in.nextLine());
				if(e<1||e>45) {
					throw new Exception("오류 : 1~45사이의 숫자를 입력하세요");
				}
				if(e==a||e==b||e==c||e==d) {
					throw new Exception("오류 : 동일한 숫자를 입력할 수 없습니다");
				}
				System.out.println("여섯번째 숫자를 입력하세요");
				f=Integer.parseInt(in.nextLine());
				if(f<1||f>45) {
					throw new Exception("오류 : 1~45사이의 숫자를 입력하세요");
				}
				if(f==a||f==b||f==c||f==d||f==e) {
					throw new Exception("오류 : 동일한 숫자를 입력할 수 없습니다");
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
				System.out.println("숫자를 입력하세요");
			}
			catch(Exception err) {
				System.out.println(err.getMessage());
			}
		}
		System.out.println("이번 주 당첨번호 : "+lotto.toString());
		System.out.println("나의 로또번호 : "+Mylotto.toString());
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
			result="1등";
		}
		if(count==5&&bonus==1) {
			result="2등";
		}
		if(count==5&&bonus==0) {
			result="3등";
		}
		if(count==4) {
			result="4등";
		}
		if(count==3) {
			result="5등";
		}
		if(count<=2) {
			result="꽝";
		}
		System.out.println("나의 당첨결과 : "+result);
	}
}
