import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        int m=n+n;
        System.out.println(m);
        int merge[]=new int[m];
        int k=0,mid=0;
        for(int i=0;i<n;i++)
        {
            merge[k]=a[i];
            k++;
        }
        for(int i=0;i<n;i++)
        {
            merge[k]=b[i];
            k++;
        }
        Arrays.sort(merge);
        
        for(int i=0;i<m;i++)
        {
            System.out.print(merge[i]+" ");
        }
       
            if(m%2!=0)
            {
                mid=merge[m/2];
               System.out.println(mid);
            }
            else
            {
                mid=(merge[m/2]+merge[m/2]-1)/2;
                 System.out.println(mid);
            }
        
        
    }
}
