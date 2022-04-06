package com.app.classes;


public class DoublyLinkList<T> {
	
	Node<T> head;

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public DoublyLinkList(Node<T> head) {
		super();
		this.head = head;
	}

	public DoublyLinkList() {
		super();
	}
	public void addFirstNode(Node<T> node) {
		if(this.getHead()==null) 
			this.setHead(node);
		else
			{
			this.getHead().setPrevious(node);
			node.setNext(this.getHead());
			this.head=node;
			
			}
	}
	public void addLastNode(Node<T> node) {
		if(this.getHead()==null) 
			this.setHead(node);
		else
			{
			Node<T> tmp=this.getHead();
			while(tmp.getNext()!=null) {
			
				tmp=tmp.getNext();
			}
			
				tmp.setNext(node);
				node.setPrevious(tmp);
			}
	}
	public void removeFirstNode() {
		if(this.getHead()!=null && this.getHead().getNext()!=null)
		{
			this.head=this.head.getNext();
			this.head.setPrevious(null);
		}
		else	
			this.setHead(null);
	}
	public void removeLastNode() {
		if(this.getHead()!=null)
		{
			Node<T> tmp=this.getHead();
			while(tmp.getNext()!=null)
				tmp=tmp.getNext();
			
			tmp=tmp.getPrevious();
			if(tmp!=null)
			tmp.setNext(null);
			else
				this.setHead(null);
				
		}

	}
	public void removeNodeAtIndex(int index) {
		
			Node<T> tmp=this.getHead();
			if(index>=0) {
			while(index>0) {
				if(tmp!=null)
				tmp=tmp.getNext();
				else
					break;
				index--;
			}
			if(tmp!=null)
				{
					Node<T> prev=tmp.getPrevious();
					Node<T> next=tmp.getNext();
					if(prev!=null)
					prev.setNext(tmp.getNext());
					else
						this.head=next;
					if(next!=null)
					next.setPrevious(tmp.getPrevious());
				}
			else
				System.out.println("invalid index");	
		
			}
			else
				System.out.println("invalid index");
			
			
			
			
	}
	public void findNode(Integer data) {
		if(this.getHead()==null)
			System.out.println("Empty list.");
		else
		{
			Node<T> tmp=this.getHead();
			int index=0;
			while(tmp.getNext()!=null) {
		
				if(tmp.getData()==data)
					break;
					
				tmp=tmp.getNext();
				index++;
			}
			
			System.out.println("data found at index: "+index);
			
		}
	}
	
	public void printDoublyList() {
		if(this.getHead()==null)
			System.out.println("Empty list.");
		else
		{
			Node<T> tmp=this.getHead();
			while(tmp!=null) {
				System.out.println(tmp.getData()+"<->");
				tmp=tmp.getNext();
			}
			
		}
	}

}
