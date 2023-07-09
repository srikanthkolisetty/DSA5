package Ass5;

public class DSA1 {

	public static void main(String[] args) {
		
		int m=2,n=2;
		int n3[][]= new int[m][n];
		int n2[]= new int[]{1,2,3,4};
		
		for(int i=0;i<n2.length;i++)
		{
			if(i>=0 && i<n)
			{
				n3[0][i]=n2[i];
			}
			if(i>=n && i<=(2*n-1))
			{
				n3[1][i-n]=n2[i];
			}
		}
		for(int []o:n3)
		{
			for(int u:o)
			{
				System.out.print(u);
			}
			System.out.println();
		}
	}
}
