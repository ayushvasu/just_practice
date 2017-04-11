package adobe_interv;

/*class Node{
	int data;
	Node left,right;
	Node(int d)
	{
		data=d;
		left=right=null;
	}
}*/
class valu{
	int min,max;
}

class verticaltreeprac{
	valu val=new valu();
	Node root;
	public void maxmin(Node n1,valu val,int hd)
	{
		if(n1==null)
			return;
		if(hd<val.min)
			val.min=hd;
		if(hd>val.max)
			val.max=hd;
		maxmin(n1.left,val,hd-1);
		maxmin(n1.right,val,hd+1);
	}
	public void printline(Node n1,int line,int hd)
	{
		if(n1==null)
			return;
		if(line==hd)
		{
			System.out.print(n1.data+" ");
			return;
		}
		printline(n1.left,line,hd-1);
		printline(n1.right,line,hd+1);
	}
	public void printvert(Node n1)
	{
		maxmin(n1,val,0);
		for(int i=val.min;i<=val.max;i++)
		{
			printline(n1,i,0);
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		verticaltreeprac tree = new verticaltreeprac();
		  
        /* Let us construct the tree shown in above diagram */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.left.right = new Node(8);
        tree.root.right.right.right = new Node(9);
  
        System.out.println("vertical order traversal is :");
        tree.printvert(tree.root);
	}
}