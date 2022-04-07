package chap15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("jdbc");
		set.add("Servlet/JSP");
		set.add("java");
		set.add("ibatis");
		
		int size = set.size();
		System.out.println("총 객체수 : "+size);
		System.out.println();
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String el = it.next();
			System.out.println("\t"+el);
		}
		System.out.println();	
		
		
		
		
	}

}
