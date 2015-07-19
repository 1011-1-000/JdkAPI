package org.java.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.java.util.MyArrayList;
import org.java.util.MyLinkedList;

public class MyArtAndLkl {
	public static void main(String[] args){
		printLists();
		myPrintLists();
	}
	
	private static void printLists(){
		List<String> a1 = new ArrayList<String>();
		a1.add("List");
		a1.add("Set");
		a1.add("Queue");
		a1.add("Map");
		System.out.println("ArrayList Elements:");
		System.out.print("\t" + a1 + "\n");
		
		List<String> l1 = new LinkedList<String>();
		l1.add("List");
		l1.add("Set");
		l1.add("Queue");
		l1.add("Map");
		System.out.println("LinkedList Elements:");
		System.out.print("\t" + l1 + "\n");
	}
	
	private static void myPrintLists(){
		MyArrayList<String> a1 = new MyArrayList<String>();
		a1.add("List");
		a1.add("Set");
		a1.add("Queue");
		a1.add("Map");
		System.out.println("MyArrayList Elements:");
		System.out.print("\t" + a1 + "\n");
		
		MyLinkedList<String> l1 = new MyLinkedList<String>();
		l1.add("List");
		l1.add("Set");
		l1.add("Queue");
		l1.add("Map");
		System.out.println("MyLinkedList Elements:");
		System.out.print("\t" + l1 + "\n");
	}
}
