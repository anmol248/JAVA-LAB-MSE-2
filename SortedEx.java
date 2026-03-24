package com.unit3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class SortedEx {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		List<Integer> list=Arrays.asList(12,5,33,9,21,1);
//		System.err.println(list);
//		List<Integer> sortedList=list.stream().sorted((a,b)->a-b).toList();// assending order
//		System.out.println(sortedList);
//	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		List<Integer> list=Arrays.asList(12,5,33,9,21,1);
//		System.err.println(list);
//		List<Integer> sortedList=list.stream().sorted((a,b)->b-a).limit(3).toList();// desending order
//		System.out.println(sortedList);
//	}
//	

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		List<Integer> list=Arrays.asList(10,5,10,7,5,3,8,3);
//		System.err.println(list);
//		List<Integer> sortedList=list.stream().distinct().sorted((a,b)->a-b).toList();// assending order
//		System.out.println(sortedList);
//	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		List<Integer> list=Arrays.asList(12,5,33,9,21,1);
//		System.err.println(list);
//		Integer sortedList=list.stream().sorted((a,b)->b-a).toList().get(1);// assending order
//		System.out.println(sortedList);	
//		
//	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		List<Integer> list=Arrays.asList(12,5,33,9,21,1);
//		System.err.println(list);
//		List<Integer> sortedList=list.stream().filter((n)->n>20).sorted((a,b)->a-b).toList();// assending order
//		System.out.println(sortedList);
//	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		List<Integer> list=Arrays.asList(12,5,33,9,21,1);
//		System.out.println(list);
//		List <Integer> l=list.stream().sorted((a,b)->b-a).toList();// assending order
//		ArrayList<Integer> N=new ArrayList<>();
//		N.addAll(l);
//		System.out.println(N);
//	}
	
//	
	

	
//	    public static void main(String[] args) {
//	        List<String> list = Arrays.asList("Ravi","Zoya","Meena","Kunal");
//	        System.err.println(list);
//	        List<String> result = list.stream().sorted((a, b) -> a.length() - b.length())
//	                .toList();
//	        System.out.println(result);
//	    }
	
	
	public static void main(String[] args) {
        ;
        System.err.println(list);
        List<String> result = list.stream().sorted((a, b) -> a.length() - b.length())
                .toList();
        System.out.println(result);
    }
	

}
