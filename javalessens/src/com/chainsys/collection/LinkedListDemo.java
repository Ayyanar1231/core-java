package com.chainsys.collection;

import java.util.LinkedList;

import java.util.Iterator;

public class LinkedListDemo {
	public static void main(String args[]) {
		LinkedList<String> stringLinkedList = new LinkedList();
		stringLinkedList.add("F");
		stringLinkedList.add("B");
		stringLinkedList.add("D");
		stringLinkedList.add("E");
		stringLinkedList.add("C");
		stringLinkedList.add("F");
		stringLinkedList.add("B");
		stringLinkedList.add("D");
		stringLinkedList.add("E");
		stringLinkedList.add("C");
		stringLinkedList.addLast("Z");
		stringLinkedList.addFirst("A");
		stringLinkedList.add(1,"AZ");
		Iterator<String> stringIterator = stringLinkedList.iterator();
		while(stringIterator.hasNext()) {
			System.out.println(stringIterator.next()+" ");
		}
		stringLinkedList.remove("F");
		stringLinkedList.remove(2);
		while(stringIterator.hasNext()) {
			System.out.println(stringIterator.next()+" ");
		}
		stringLinkedList.removeFirst();
		stringLinkedList.removeLast();
		while(stringIterator.hasNext()) {
			System.out.println(stringIterator.next()+" ");
		}
	}

}
