package adobe_interv;

class Node{
	int data;
	Node left,right;
	Node(int d)
	{
		data=d;
		left=right=null;	
	}	
}

class Values{
	int max,min;
}

class printverticaltree{
	Values val=new Values();
	Node root;
	public void findmaxmin(Node node,Values val,int hd)
	{
		if(node==null)
			return;
		
		if(hd<val.min)
			val.min=hd;
		else if(hd>val.max)
			val.max=hd;
		findmaxmin(node.left,val,hd-1);
		findmaxmin(node.right,val,hd+1);
	}
	public void printvertical(Node node,int line,int hd)
	{
		if(node==null)
			return;
		if(line==hd)
			System.out.print(node.data+" ");
		printvertical(node.left, line, hd-1);
		printvertical(node.right, line, hd+1);
	}
	public void verticalorder(Node node)
	{
		findmaxmin(node,val,0);
		for(int i=val.min;i<=val.max;i++)
		{
			printvertical(node,i,0);
			System.out.println("");
		}
	}
	public static void main(String args[])
	{
		printverticaltree tree = new printverticaltree();
		  
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
        tree.verticalorder(tree.root);
	}
}