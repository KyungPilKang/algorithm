import java.util.Arrays;
import java.util.Scanner;

public class codeup_1498 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=Integer.parseInt(sc.next());
		int g=Integer.parseInt(sc.next());
		
		int[] num=new int[n];
		for(int i=0;i<num.length;i++) {
			num[i]=Integer.parseInt(sc.next());
		}
		
		int idx=0;
		for(int i=0;i<=(n/g);i++) {
			int[] temp=Arrays.copyOfRange(num, idx, idx+g);
			idx+=g;
			Arrays.sort(temp);
			if(temp[0]!=0) {
				System.out.print(temp[0]+" ");
			}else {
				for(int j=0;j<temp.length;j++) {
					if(temp[j]>0) {
						System.out.println(temp[j]+" ");
						break;
					}
				}
			}
		}
	}
}

