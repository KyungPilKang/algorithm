import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class codeup_1472 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=Integer.parseInt(sc.next());
		int m=Integer.parseInt(sc.next());
		
		Integer temp[]=new Integer[n*m];
		for(int i=0;i<temp.length;i++) {
			temp[i]=i+1;
		}
		Arrays.sort(temp, Collections.reverseOrder());
		
		int idx=0;
		if(n%2==1) {
			for(int i=0;i<n;i++) {
				if(n==1) {
					Arrays.sort(temp, Collections.reverseOrder());
					for(int j=0;j<temp.length;j++) {
						System.out.print(temp[j]+" ");
					}
					break;
				}
				if(i!=0&&i%2!=0) {
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
