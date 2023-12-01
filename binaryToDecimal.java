import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0,mul=0;
		while(true)
		{
		    if(n==0)
		    {
		        break;
		    }
		    else
		    {
		    int temp=n%10;
		     mul+=temp*Math.pow(2,i);
		    n=n/10;
		    i++;
		    }
		}
		System.out.print(mul);
	}
}
