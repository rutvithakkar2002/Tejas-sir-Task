#include<stdio.h>
#include<conio.h>
#define SIZE 7
void main()
{
	int a[SIZE],key,low=0,high=SIZE-1;
	int i,j,flag=-1;
	clrscr();
	for(i=0;i<SIZE;i++)
	{
		printf("Enter The value of a[%d]",i);
		scanf("%d",&a[i]);
	}
	printf("\n The array is \n");
	for(i=0;i<SIZE;i++)
	{
		printf("\t%d",a[i]);
	}
	printf("\n Enter the key: ");
	scanf("%d",&key);
	while(low<=high)
	{
		mid=(low+high)/2;
		if(key==a[mid])
		{
			flag=mid;
			break;
		}
		else if(key>a[mid])
		{
			
		}
	}