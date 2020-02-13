package arrays;

//import java.util.Scanner;

public class arrays{
	public static void main(String args[]) {
		//Scanner input = new Scanner(System.in);
		//Scanner jinput = new Scanner(System.in);
		System.out.println("kaça kaçlık matris istersiniz:");
		//int i = input.nextInt();
		//int j = jinput.nextInt();
		int [][] a = new int[4][4];
		for (int i = 0;i<a.length;i++)
			for(int j= 0;j<a.length;j++)
				a[i][j] = 3;
		System.out.println("kaça kaçlık matris istersiniz:");
		//int x = input.nextInt();
		//int y = jinput.nextInt();
		int [][] b = new int[4][4];
		for (int i = 0;i<b.length;i++)
			for(int j= 0;j<b.length;j++)
				b[i][j] =4;
		int[][]c = new int[4][4];
		for (int l = 0; l<a.length; l++)
			for (int m = 0; m<a.length;m++)
			{
				for(int k = 0;k<a.length;k++)
					c[l][m]+=a[l][k]*b[k][m];
				
			}
		for (int i = 0;i<c.length;i++)
			for(int j= 0;j<c.length;j++)
				System.out.println(c[i][j]);
	}
}