import java.util.*;
class Que1
{
	public static void  insertionSort(int a1[],int n)
	{
		int k=a1[n-1];
		int i,j;
		
		for(i=n-1;i>0;i--)
		{
			for(j=i-1;j>0;j--)
			{
				if(a1[j]<k)
				{
					a1[j]=k;
					printarray(a1,n);
					
					break;
					
				}
				else
				{
					a1[i]=a1[j];
					printarray(a1,n);
					break;
				}
				
				
			}
		   
		}
		
	}
	public static void printarray(int a1[],int n)
	{
		for(int i=0;i<n;i++)
		{
			
			System.out.print("  "+a1[i]);
			
			
		}
		System.out.println(" ");
	}
	
		public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array ");
		int n=sc.nextInt();
		int a1[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a1[i]=sc.nextInt();
		}
		insertionSort(a1,n);
	}
}