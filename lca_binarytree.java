/*Following is definition of LCA from Wikipedia:
Let T be a rooted tree. The lowest common ancestor between two nodes n1 and n2 is defined as the lowest node
 in T that has both n1 and n2 as descendants (where we allow a node to be a descendant of itself).

The LCA of n1 and n2 in T is the shared ancestor of n1 and n2 that is located farthest from the root. 
Computation of lowest common ancestors may be useful, for instance, as part of a procedure for determining 
the distance between pairs of nodes in a tree: the distance from n1 to n2 can be computed as the distance 
from the root to n1, plus the distance from the root to n2, minus twice the distance from the root 
to their lowest common ancestor. */

package adobe_interv;


class lca_binarytree{
	
	
	 Node root;
		
	public Node lca_tree(Node root,int n1,int n2)
	{
		if(root==null)
			return null;
		if(root.data==n1 || root.data==n2)
			return root;
		Node left_lca=lca_tree(root.left, n1, n2);
		Node right_lca=lca_tree(root.right, n1, n2);
		
		if(left_lca!=null && right_lca!=null)
			return root;
		if(left_lca!=null)
			return left_lca;
		else
			return right_lca;

	}
	public static void main(String args[])
	{
		lca_binarytree tree = new lca_binarytree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        System.out.println("LCA(4, 5) = " +
                            tree.lca_tree(tree.root,4, 5).data);
        System.out.println("LCA(4, 6) = " +
                            tree.lca_tree(tree.root,4, 6).data);
        System.out.println("LCA(3, 4) = " +
                            tree.lca_tree(tree.root,3, 4).data);
        System.out.println("LCA(2, 4) = " +
                            tree.lca_tree(tree.root,2, 4).data);
	}
}