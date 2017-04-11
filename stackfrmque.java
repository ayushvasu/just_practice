package adobe_interv;

import java.io.*;
import java.util.*;
class stackfrmque{
	Queue<Integer> q;
	Queue<Integer> tmp;
	public stackfrmque(){
		q=new LinkedList<Integer>();
		tmp=new LinkedList<Integer>();
	}
	public void push(int data)
	{
		if(q.size()==0)
		{
			q.add(data);
		}
		else 
		{
			int l=q.size();
			for(int i=0;i<l;i++)
			{
				tmp.add(q.remove());
			}
			//System.out.println(data);
			q.add(data);
			System.out.println(tmp.size());
			
			disptmp();
			System.out.println();
			for(int i=0;i<tmp.size();i++)
			{
				
				q.add(tmp.remove());
			}
		}
	}
	public void pop()
	{
		if(q.size()==0)
			System.out.println("No element in the stack");
		else
			q.remove();
	}
	public void dispstack()
	{
		//int l=q.size();
		Iterator it =q.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		System.out.println();
	}
	public void disptmp()
	{
		Iterator it=tmp.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		//BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		stackfrmque sq =new stackfrmque();
		sq.push(10);	
	
		sq.push(20);
		
		sq.push(30);
		
		sq.push(40);
		//sq.dispstack();
		//sq.pop();
		//sq.dispstack();
	}
}