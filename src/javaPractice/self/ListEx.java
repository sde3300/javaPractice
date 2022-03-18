package javaPractice.self;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ListEx {

	public static void main(String[] args) {
		
//		 ArrayList pitches = new ArrayList();
//		 pitches.add("138"); 
//		 pitches.add("129");
//		 pitches.add("142"); 
//		 pitches.add(0, "123");
//		  
//		 System.out.println(pitches.get(2)); 
//		 System.out.println(pitches.size());
//		 System.out.println(pitches.contains("123"));
//		 System.out.println(pitches);
//		 
//	
//		 String[] data = {"125", "157", "478"}; 
//		 ArrayList <String> pitches = new ArrayList<>(Arrays.asList(data));
//		  
//		 System.out.println(pitches);
		 

		ArrayList<String> pitches = new ArrayList<>(Arrays.asList("90", "17", "80"));
		pitches.sort(Comparator.naturalOrder());
		System.out.println(pitches);

	}

	
	 
}
