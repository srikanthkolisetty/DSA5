package Ass5;

public class DSA7 {

	public static void main(String[] args) {
		
		int n[]= {3,4,5,1,2};
		int min=n[0];
		for(int i=0;i<n.length;i++)
		{
			if(min<n[i])
			{
				min=n[i];
			}
		}
		System.out.println(min);
	}
}
