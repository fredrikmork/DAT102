package no.hvl.dat102;

public class BinaryTree {
	private BTN root;

	public BinaryTree() {
		root = null;
	}

	public void ImplementingTree() {
		BTN a = new BTN('A');
		BTN b = new BTN('B');
		BTN c = new BTN('C');
		BTN d = new BTN('D');
		BTN e = new BTN('E');

		a.setLeft(b);
		a.setRight(c);
		b.setLeft(d);
		b.setRight(e);

		root = a;

	}

	public void PreorderTraversal() {
		PreorderTraversal(root);
		System.out.println();
	}

	private void PreorderTraversal(BTN p) {
		if (p != null) {
			System.out.print(" " + p.getData());
			PreorderTraversal(p.getLeft());
			PreorderTraversal(p.getRight());
		}
		// else: BaseCase - do nothing
	}

	public void InorderTraversal() {
		InorderTraversal(root);
		System.out.println();
	}

	private void InorderTraversal(BTN p) {
		if (p != null) {
			InorderTraversal(p.getLeft());
			System.out.print(" " + p.getData());
			InorderTraversal(p.getRight());
		}
	}

	public void PostorderTraversal() {
		PostorderTraversal(root);
		System.out.println();
	}

	private void PostorderTraversal(BTN p) {
		if (p != null) {
			PreorderTraversal(p.getLeft());
			PreorderTraversal(p.getRight());
			System.out.print(" " + p.getData());
		}
	}

	public void LevelorderTraversal() {

	}

	private void LevelorderTraversal(BTN p) {

	}

	public int count() {
		return count(root);
	}

	private int count(BTN p) {
		if (p == null) { // BaseCase
			return 0;
		} else {
			return count(p.getLeft()) + count(p.getRight()) + 1; // Recursive call
		}
	}
	
	public int height() {
		return height(root);
	}
	private int height(BTN p) {
		int max = 0;
		if ( p == null) { //BaseCase
			return -1;
		} else {
			int l = height(p.getLeft());
			int r = height(p.getRight());
			max = Math.max(l, r);
		}
		return max + 1;
	}

}
