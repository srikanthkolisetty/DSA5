package Ass5;

public class DSA8 {

	public static void main(String[] args) {
		
		int n[]= {1,3,4,2,6,8};
		int k=0;
		int n2[]=new int[n.length];
		for(int i=0;i<n.length;i++)
		{
			for(int j=0;j<n.length;j++)
			{
				if(n[i]*2==n[j])
				{
					n2[k]=n[i];
					k++;
					
				}
				if(k>=n.length/2)
					break;
			}
		}
		for(int i:n2)
		{
			System.out.println(i);
		}
	}
}
