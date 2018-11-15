package no.hvl.dat102;

public class ClientTree {
	public static void main(String[] args) {
		BinaryTree t = new BinaryTree();
		t.ImplementingTree();
		t.PreorderTraversal();
		t.InorderTraversal();
		t.PostorderTraversal();
		//t.LevelorderTraversal();
		System.out.println(" Antall noder: " + t.count());
		System.out.println(" Høyden på treet: " + t.height());
	}
}
