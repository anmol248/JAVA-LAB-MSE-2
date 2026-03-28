package com.unit3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Minmax {

	public static void main(String[] args) {
		// second largest
		
		List<Integer> list=Arrays.asList(12,5,20,8,30,5,8);
		System.err.println(list);
	   Integer sortedList=list.stream().distinct().sorted((a,b)->b-a).toList().get(2);
	  System.out.println(sortedList);
		
	}

}
