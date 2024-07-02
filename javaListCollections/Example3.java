package com.javaListCollections;

import java.util.Iterator;
import java.util.Vector;

public class Example3 {

	public static void main(String[] args) {
		
		Vector<Integer> list = new Vector<Integer>();
		
		list.add(100);
		list.add(null);
		list.add(200);
		list.add(600);
		list.add(400);
		list.add(670);
		list.add(null);
		list.add(330);
		list.add(240);
		list.add(700);
		list.add(670);
		
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
	}

}
