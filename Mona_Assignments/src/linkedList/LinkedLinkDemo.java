package linkedList;

import java.util.LinkedList;

public class LinkedLinkDemo {
	public static void main(String[] args) {
		LinkedList<String> cities = new LinkedList<>();
		
		cities.add("London");
		cities.add("Paris");
		cities.add("Tokyo");
		cities.add("New York");
		cities.add("New Delhi");
		
		for (String x : cities){
			System.out.println(x);
		}
	}

}
