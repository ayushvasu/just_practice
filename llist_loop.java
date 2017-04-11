package adobe_interv;

import java.io.*;
import java.util.*;
class llist_loop{
	 static class Node{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	 static Node head;
	public void printList(Node node)
	{
		while(node!=null)
		{
			System.out.print(node.data+" ");
			node=node.next;
		}
	}
	public int detectandrem(Node node)
	{
		Node fast=node,slow=node;
		while(fast!=null && slow!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				removeloop(slow,node);
				return 1;
			}
		}
		return 0;
	}
	public void removeloop(Node loop,Node curr){
		Node ptr1=curr,ptr2=null;
		while(1==1)
		{
			ptr2=loop;
			while(ptr2.next!=loop && ptr2.next!=ptr1)
			{
				ptr2=ptr2.next;
			}
			if(ptr2.next==ptr1)
			{
				break;
			}
			ptr1=ptr1.next;
		}
		ptr2.next=null;
	}
	public static void main(String args[])
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		llist_loop list = new llist_loop();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);
 
        // Creating a loop for testing 
        head.next.next.next.next.next = head.next.next;
        list.detectandrem(head);
        System.out.println("Linked List after removing loop : ");
        list.printList(head);
	}
}