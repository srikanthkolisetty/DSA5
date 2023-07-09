package Ass5;

public class DSA5 {

	public static void main(String[] args) {
		
		int n[]= {4,5,8},n2[]= {10,9,1,8};
		 int d=2;
		for(int i=0;i<n.length;i++)
		{
			for(int j=0;j<n2.length;j++)
			{
				if(Math.abs(n[i]-n2[j])<=d)
				{
					System.out.println(n[i]+" "+n2[j]);
				}
			}
		}
	}
}
