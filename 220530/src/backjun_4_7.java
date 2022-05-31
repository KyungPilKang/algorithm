import java.util.Arrays;
import java.util.Scanner;

public class backjun_4_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input1=Integer.parseInt(sc.next());
		double [] output=new double[input1];
		for(int i=0;i<input1;i++) {
			int over_person=0;
			int input2=Integer.parseInt(sc.next());
			double [] score=new double[input2];
			for(int j=0;j<input2;j++) {
				score[j]=Integer.parseInt(sc.next());
			}
			for(int k=0;k<score.length;k++) {
				if(Arrays.stream(score).average().getAsDouble()<score[k]) {
					over_person=over_person+1;
				}
			}
			output[i]=((double)over_person/(double)score.length)*100;
			
		}
		for(int l=0;l<input1;l++) {
			System.out.println(String.format("%.3f",output[l])+"%");
		}
	}

}
