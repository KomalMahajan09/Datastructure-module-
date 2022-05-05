class Que3
{
	int a[];
	int size;
	int top1,top2;
	Que3(int n)
	{
		size=n;
		a=new int[size];
		top1=n/2+1;
		top2=n/2;
		
	}
	void push1(int x)
	{
		if(top1>0)
		{
			top1--;
			a[top1]=x;
			
		}
		else
		{
			System.out.println("overflow");
			return;
			
		}
	
	}
	void push2(int x)
	{
		if(top2<size-1)
		{
			top2++;
			a[top2]=x;
			
		}
		else
		{
			System.out.println("Overflow");
			return;
			
		}
	
	}
	int pop1()
	{
		if(top1<=size/2)
		{
			int x=a[top1];
			top1++;
			return x;
			
			
		}
		else{
			System.out.println("overflow");
			return 0;
		}
	}
	
	int pop2()
	{
		if(top2>=(size/2)+1)
		{
			int x=a[top2];
			top2--;
			return x;
			
			
		}
		else{
			System.out.println("overflow");
			return 0;
		}
	}
	public static void main(String args[])
	{
		int n=10;
		Que3 q=new Que3(n);
		q.push1(5); 
		q.push2(10); 
		q.push2(15); 
		q.push1(11); 
		q.push2(7); 
		System.out.println("Popped element from stack1 is"+q.pop1());
		q.push2(40);
		System.out.println("Popped element from stack2 is"+q.pop2());
		
		
		
		

	}
}	

