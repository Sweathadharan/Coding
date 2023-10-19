import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		int left[]=new int[n];
		int right[]=new int[n];
		int ans[]=new int[n];
		
		left[0]=1;
		for(int i=1;i<n;i++)
		{
		    left[i]=left[i-1]*a[i-1];
		}
		right[n-1]=1;
		for(int i=n-2;i>=0;i--)
		{
		    right[i]=right[i+1]*a[i+1];
		}
		for(int i=0;i<n;i++)
		{
		    ans[i]=left[i]*right[i];
		    System.out.print(ans[i]);
		}
	}
}
