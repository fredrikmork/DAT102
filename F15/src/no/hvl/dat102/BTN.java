package no.hvl.dat102;

public class BTN {
	private Character data;
	private BTN left, right;
	
	public BTN (Character data) {
		this.data = data;
		left = null;
		right = null;
	}

	public Character getData() {
		return data;
	}

	public void setData(Character data) {
		this.data = data;
	}

	public BTN getLeft() {
		return left;
	}

	public void setLeft(BTN left) {
		this.left = left;
	}

	public BTN getRight() {
		return right;
	}

	public void setRight(BTN right) {
		this.right = right;
	}

}
