package adobe_interv;

import java.util.Stack;

class quefrmstack{
	Stack<Integer> s;
	Stack<Integer> tmp;
	public quefrmstack()
	{
		s= new Stack<Integer>();
		tmp= new Stack<Integer>();
	}
	public void insert(int data){
		int l=s.size();
		if(l==0)
		{
			s.push(data);
		}
		else
		{
			for(int i=0;i<l;i++)
			{
				tmp.push(s.pop());
			}
			s.push(data);
			for(int i=0;i<l;i++)
			{
				s.push(tmp.pop());
			}
		}
	}
	public void remove(){
		if(s.size()==0)
			System.out.println("Empty Que");
		else
			s.pop();
		
	}
	public void dispque()
	{
		int l=s.size();
		
		for(int i=l-1;i>=0;i--)
		{
			System.out.print(s.get(i)+" ");
		}
		System.out.println();
	}
	public static void main(String args[]){
		quefrmstack qs=new quefrmstack();
		qs.insert(10);
	
		qs.insert(20);
		qs.insert(40);
		qs.insert(30);
		qs.dispque();
		qs.remove();
		qs.dispque();
	}
	
}