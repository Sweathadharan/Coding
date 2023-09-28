import java.util.*;
import java.util.HashSet;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    b[i]=sc.nextInt();
		}
		Set<Integer>s=new HashSet<Integer>();
		for(int i=0;i<n;i++)
		{
		    s.add(a[i]);
		}
		
		
		for(int i=0;i<n;i++)
		{
		    s.add(b[i]);
		}
		ArrayList<Integer>ls=new ArrayList<>();
		for(int i:s)
		{
		    ls.add(i);
		}
		
		System.out.print(ls);
		
		
		
	}
}
