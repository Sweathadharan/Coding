import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dec[]=new int[40];
        int i=0;
        while(n!=0)
        {
            dec[i]=n%2;
            i++;
            n=n/2;
        }
        for(int j=i-1;j>=0;j--)
        {
            System.out.print(dec[j]);    
            
   }
        }
}
