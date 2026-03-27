package com.unit3;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMax2 {

	public static void main(String[] args) {
		// top 3 largest numbers
		 public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 5, 20, 8, 30, 5, 8);

        list.stream()
            .distinct()                          
            .sorted(Comparator.reverseOrder()) 
            .limit(3)                            
            .forEach(System.out::println);      
    }
		
	}

}
