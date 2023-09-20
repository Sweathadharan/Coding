Array rotation k times

/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    int n,k,j;
    scanf("%d",&n);
    int a[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
     scanf("%d",&k);
    for(j=1;j<=k;j++)
    {
    
    int temp=a[n-1];
    for(int i=n-1;i>0;i--)
    {
        a[i]=a[i-1];
    }
    a[0]=temp;
    
    }
    
    for(int i=0;i<n;i++)
    {
        printf("%d",a[i]);
    }

    return 0;
}
