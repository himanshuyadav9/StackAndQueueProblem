package com.stack;

import com.bridgelabz.INode;
import com.bridgelabz.MyLinkedList;
import com.bridgelabz.MyNode;

public class MyQueue {
	public final MyLinkedList myLinkList;

	public MyQueue() {

		this.myLinkList = new MyLinkedList();
	}

	public void enqueu(INode myNode) {
		myLinkList.append(myNode);
	}

	public void printQueue() {
		myLinkList.printMyNodes();
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Queue Problem");
		MyQueue myQueue = new MyQueue();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		myQueue.enqueu(myFirstNode);
		myQueue.printQueue();
		myQueue.enqueu(mySecondNode);
		myQueue.printQueue();
		myQueue.enqueu(myThirdNode);
		myQueue.printQueue();

	}

}
