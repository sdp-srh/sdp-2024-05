package datatypes;

import java.util.Stack;

class BinaryTreeNode {
	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;

	BinaryTreeNode(int data) {
		this.data = data;
	}
}

public class BinaryTree {

	// Recursive Solution
	public void preorder(BinaryTreeNode root) {
		if (root != null) {
			// Pre order traversal
			System.out.printf("%d ", root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}

	// Iterative solution
	public void preorderIter(BinaryTreeNode root) {

		if (root == null)
			return;

		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		s.push(root);

		while (!s.empty()) {

			BinaryTreeNode n = s.pop();
			System.out.printf("%s ", n.data);

			if (n.right != null) {
				s.push(n.right);
			}
			if (n.left != null) {
				s.push(n.left);
			}

		}

	}

	public static void main(String[] args) {
		BinaryTree bi = new BinaryTree();
		// Creating a binary tree
		BinaryTreeNode rootNode = createBinaryTree();
		System.out.println("Using Recursive solution:");

		bi.preorder(rootNode);

		System.out.println();
		System.out.println("-------------------------");
		System.out.println("Using Iterative solution:");

		bi.preorderIter(rootNode);

	}

	public static BinaryTreeNode createBinaryTree() {

		BinaryTreeNode rootNode = new BinaryTreeNode(30);
		BinaryTreeNode node20 = new BinaryTreeNode(20);
		BinaryTreeNode node10 = new BinaryTreeNode(10);
		BinaryTreeNode node80 = new BinaryTreeNode(80);
		BinaryTreeNode node60 = new BinaryTreeNode(60);
		BinaryTreeNode node50 = new BinaryTreeNode(50);
		BinaryTreeNode node70 = new BinaryTreeNode(70);


		rootNode.left = node20;
		rootNode.right = node60;

		node20.left = node10;
		node20.right = node80;

		node60.left = node50;
		node60.right = node70;

		return rootNode;
	}
}
