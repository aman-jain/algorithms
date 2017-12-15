package com.learn.algorithms.searching;

public class BSTClient {

	public static void main(String[] args) {
		BinarySearchTree<String, Integer> bst = new BinarySearchTree<String, Integer>();
		bst.put("S",0);
		bst.put("E",1);
		bst.put("A",2);
		bst.put("R",3);
		bst.put("C",4);
		bst.put("H",5);
		bst.drawTree();

	}

}
