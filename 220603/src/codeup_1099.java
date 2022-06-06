import java.util.Scanner;

public class codeup_1099 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int miro[][]=new int[10][10];
		int x=1;
		int y=1;
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				miro[i][j]=Integer.parseInt(sc.next());
			}
		}
		
		sc.close();
		
		while(true) {
			if(miro[x][y]==2) {
				miro[x][y]=9;
				break;
			}
			miro[x][y]=9;
			if(miro[x][y+1]==0||miro[x][y+1]==2) {
				y++;
				continue;
			} else if(miro[x][y+1]==1) {
				if(miro[x+1][y]==0||miro[x+1][y]==2) {
					x++;
					continue;
				} else if(miro[x+1][y]==1) {
					break;
				}
			}
		}
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(miro[i][j]+" ");
			}
			System.out.println();
		}
	}
}
