package com.app.classes;

public class Node<T> {
	
	T data;
	Node<T> previous;
	Node<T> next;
	public Node(T data) {
		this.data=data;
		this.previous=null;
		this.next=null;
	}
	public Node(T data,Node<T> next,Node<T> prev) {
		this.data=data;
		this.previous=prev;
		this.next=next;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getPrevious() {
		return previous;
	}
	public void setPrevious(Node<T> previous) {
		this.previous = previous;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}

}
