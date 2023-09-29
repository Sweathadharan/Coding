#include<stdio.h>
int main()
{
    int n,k,count,sum=0;
    scanf("%d",&n);
    int a[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(int i=0;i<n;i++)
    {
        for(int j=i;j<n;j++)
        {
            for(int k=i;k<=j;k++)
            {
                printf("%d",a[k]);
            }
            printf("\n");
            
        }
    }
    // printf("%d",count);
}
