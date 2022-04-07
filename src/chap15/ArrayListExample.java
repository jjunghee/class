package chap15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "database");
		list.add("ibatis");
		
		int size = list.size();
		System.out.println("총 객체수 : "+size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2 : "+skill);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.print(i+ " : "+ str+"\t");
		}
		System.out.println();
		
		boolean isIbatis = list.contains("ibatis");
		System.out.println(isIbatis);
		
		list.remove(2);
		list.remove(2);
		list.remove("ibatis");
		
		isIbatis = list.contains("ibatis");
		System.out.println(isIbatis);
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.print(i+ " : "+ str+"\t");
		}
		System.out.println();
		
		boolean empty = list.isEmpty();
		System.out.println(empty);
		
		System.out.println(list.iterator().toString());
		
		
		
		
	}
}































