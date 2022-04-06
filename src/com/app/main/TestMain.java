package com.app.main;

import com.app.classes.DoublyLinkList;
import com.app.classes.Node;

public class TestMain {
	
	public static void main(String[] args) {
		
		DoublyLinkList<Integer> list = new DoublyLinkList<Integer>();
		list.addFirstNode(new Node<Integer>(0));
		list.addLastNode(new Node<Integer>(1));
		list.addLastNode(new Node<Integer>(2));
		list.addLastNode(new Node<Integer>(3));
		list.addLastNode(new Node<Integer>(4));
		list.addFirstNode(new Node<Integer>(1));
		list.addLastNode(new Node<Integer>(5));
		list.printDoublyList();
	//	System.out.println("after remove at index 3");
		//list.removeNodeAtIndex(2);
		//list.removeNodeAtIndex(3);
		//list.removeNodeAtIndex(1);
	//	list.removeNodeAtIndex(0);
	//	list.removeNodeAtIndex(2);
	//	list.removeNodeAtIndex(9);
	//	list.removeNodeAtIndex(-2);
		//list.removeNodeAtIndex(0);
	//	list.removeNodeAtIndex(0);
	//	list.removeFirstNode();
	//	list.removeFirstNode();
	//	list.removeFirstNode();
		//list.removeLastNode();
		//list.removeLastNode();list.removeLastNode();list.removeLastNode();list.removeLastNode();
		//list.removeLastNode();
		//list.removeLastNode();
		list.findNode(3);
		//list.printDoublyList();
	}

}
