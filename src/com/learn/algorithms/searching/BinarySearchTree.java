package com.learn.algorithms.searching;

public class BinarySearchTree <Key extends Comparable<Key>, Value> {
	private Node root;
	private class Node {
		private Key key;
		private Value value;
		private Node leftLink;
		private Node rightLink;
		private int nodeCount;
		Node(Key key, Value value, int nodeCount){
			this.key = key;
			this.value = value;
			this.nodeCount = nodeCount;
			this.leftLink = null;
			this.rightLink = null;
		}
		
		public void setLeftLink(Node n){
			this.leftLink = n;
		}
		public void setRightLink(Node n){
			this.rightLink = n;
		}
		public Node getLeftLink(){
			return this.leftLink;
		}
		public Node getRightLink(){
			return this.rightLink;
		}
		
	}
	public void drawTree(){
		drawTree(root, true);
	}
	private void drawTree(Node root, boolean isRoot){
		if (isRoot == true){
			System.out.println(root.key.toString() + "|" + root.value.toString());
		}
		
		String left = "";
		String right= "";
		if(root.leftLink != null){		
			left = root.leftLink.key.toString() + "|" + root.leftLink.value.toString();		
		}
		
		if(root.rightLink != null){
			right = root.rightLink.key.toString() + "|" + root.rightLink.value.toString();
		}
		if(!left.equalsIgnoreCase("") || !right.equalsIgnoreCase("")){
			System.out.println("//         \\\\");
			System.out.println(left + "--------" + right);
		}
		
		if(root.leftLink != null){
			drawTree(root.leftLink, false);
		}
		if(root.rightLink != null){
			drawTree(root.rightLink, false);
		}
	}
	public int getSize(){
		return getSize(root);
	}
	private int getSize(Node root){
		if(root == null){
			return 0;
		}else {
			return root.nodeCount;
		}
	}
	public Value getValue(Node n) {
		return n.value;
	}

	public Node get(Key key){
		return get(root, key);
	}
	private Node get(Node root, Key key){
		if(root == null){
			return null;
		}
		if(key.compareTo(root.key) == 0){
			return root;
		}else{
			if(key.compareTo(root.key) > 0) {
				return get(root.getRightLink(), key);
			} else{
				return get(root.getLeftLink(), key);
			}
		}
	}
	public void put(Key key, Value value){
		root = put(root, key, value);
	}
	public Node put(Node root, Key key, Value value){
		Node rootNode = null;
		
		if( root == null){
			
			rootNode = new Node(key, value, 1);	
			//System.out.println("In if"+rootNode.key);
			return rootNode;
		} else{
			//System.out.println("In else"+root.key);
			rootNode = root;
			//System.out.println(key.compareTo(rootNode.key));
			if(key.compareTo(rootNode.key) == 0) {
				rootNode.value = value;
			}else if (key.compareTo(rootNode.key) > 0){
				//System.out.println("right link");
				rootNode.rightLink = put(rootNode.getRightLink(), key, value);
			}else {
				//System.out.println("left link");
				rootNode.leftLink = put(rootNode.getLeftLink(), key, value);
			}	
		}
		rootNode.nodeCount = getSize(rootNode.leftLink) +  getSize(rootNode.rightLink) + 1;
		return rootNode;
	}
}
