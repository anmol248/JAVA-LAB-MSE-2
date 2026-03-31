package com.unit3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Practicee2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print sq of first 3 smallest number
//		
//      List<Integer> list=Arrays.asList(5,15,25,35,45,20,10);
//	    System.err.println(list);
//	    list.stream().sorted((a,b)->a-b).filter(n->n>20).filter(n->n%2!=0).limit(1).forEach(System.out::println);
	
		//print the product of all numbers greater than 5
	
//		List<Integer> list=Arrays.asList(5,15,25,35,45,20,10);
//        System.err.println(list);
//	    int product=list.stream().sorted((a,b)->a-b).filter(n->n>5).reduce(1,(a,b)->a*b);
//	    System.out.println(product);
		
		List<Integer> list=Arrays.asList(5,15,25,35,45,20,10);
        System.err.println(list);
	   list.stream().sorted((a,b)->a-b).skip(2).limit(1).forEach(System.out::println);;
	    
	}

}
