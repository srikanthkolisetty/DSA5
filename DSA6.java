package Ass5;

public class DSA6 {

	public static void main(String[] args) {
		
		int n[]= {4,3,2,7,8,2,3,1};
		int r[]=new int[n.length];
		int k=0;
		for(int i=0;i<n.length;i++)
		{
			int count=1;
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]==n[j])
				{
					count++;
				}	
			}
			if(count==2)
			{
				r[k]=n[i];
				k++;
			}
		}
		
		for(int i:r)
		{
			System.out.println(i);
		}
	}
}
