package adobe_interv;

class sum_tree{
	Node root;
	public int sumtree(Node root)
	{
		if(root==null)
			return 0;
		int old_data=root.data;
			
		root.data=sumtree(root.left)+sumtree(root.right);
		
		return root.data+old_data;
	}
	public static void main(String args[]){
		
	}
}