package Ass5;

public class DSA2 {

public static void main(String[] args) {
		
		int n=11;
		int i=0;
		while(true)
		{	
			i++;
			if(n>=i)
			{
				n-=i;
			}
			else
			{
				System.out.println(i-1+"row is last row");
				break;
			}
		}
	}
}
