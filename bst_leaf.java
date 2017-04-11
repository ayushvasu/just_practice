package adobe_interv;

class node{
	int data;
	node left,right;
	node(int d){
		data=d;
		left=right=null;
	}
}
class bst_leaf{
	node head;
	public void printleaf(node head){
		if(head==null)
			return;
		if(head.left==null && head.right==null)
		{
			System.out.print(head.data+" ");
			return;
		}
		else
		{
			printleaf(head.left);
			printleaf(head.right);
		}
	}
	
	public static void main(String args[])
	{
		bst_leaf bl=new bst_leaf();
		bl.head=new node(60);
		bl.head.left= new node(30);
		bl.head.right=new node(80);
		bl.head.left.left=new node(10);
		bl.head.left.right=new node(40);
		bl.head.right.left=new node(70);
		bl.head.right.right=new node(90);
		bl.printleaf(bl.head);
		
	}
}