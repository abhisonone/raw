
public class BST {
	
	private Node root;
	
	public BST() {
		root = null;
	}
	
	public void insert(int data)
	{
		root = insertNode(root, data);
	}

	private Node insertNode(Node it, int data) {
		
		if(it == null)
		{
			Node tmp = new Node(data);
			return tmp;
		}
		
		if(data < it.data)
			it.left = insertNode(it.left, data);
		else if(data > it.data)
			it.right = insertNode(it.right, data);

		return it;
		
	}

	public void preOrder()
	{
		printPreOrder(root);
	}
	
	private void printPreOrder(Node it) {
		
		if(it != null)
		{
			System.out.print(it);
			printPreOrder(it.left);
			printPreOrder(it.right);
		}
	}
	
	public void inOrder()
	{
		printInOrder(root);
	}
	
	private void printInOrder(Node it) {
		
		if(it != null)
		{
			printInOrder(it.left);
			System.out.print(it);
			printInOrder(it.right);
		}
	}

	public String toString() {
		
		return "";
	}
}
