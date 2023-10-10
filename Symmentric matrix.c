#include<stdio.h>
int main()
{
    int n,flag;
    scanf("%d",&n);
    int a[n][n],b[n][n];
    
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            b[i][j]=a[j][i];
        }
    }
    
     for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(a[i][j]!=b[i][j])
            {
                flag=0;
            }
        }
        if(flag==0)
        break;
    }
    
    if(flag==0)
    printf("Yes");
    else
    printf("No");
    
}
