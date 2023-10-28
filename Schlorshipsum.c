#include <stdio.h>

int main(void) {
	int r;
	scanf("%d",&r);
	if(r>=0 && r<=50)
	{
	    printf("100");
	}
	else if(r>=51 && r<=100)
	{
	    printf("50");
	}
	else
	{
	    printf("0");
	}
	return 0;
}

