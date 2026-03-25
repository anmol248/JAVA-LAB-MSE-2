package com.unit3;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Integer> sortedList=list.stream().sorted((a,b)->b-a).toList();
				//System.out.println(list);
				//System.out.println(sortedList);
		
//		List<Integer> list=Arrays.asList(10,20,5,40,15);
//		Optional<Integer> result=list.stream().min((a,b)->a-b);
//		result.ifPresent(System.out::println);
		
//		List<Integer> list=Arrays.asList(10,20,5,40,15);
//		Optional<Integer> result=list.stream().min((a,b)->b-a);
//		result.ifPresent(System.out::println);

		
//		List<Integer> list=Arrays.asList(12,5,20,8,30,5,8);
//		System.err.println(list);
//	   Integer sortedList=list.stream().sorted((a,b)->a-b).toList().get(1);
//	  System.out.println(sortedList);
		
		List<Integer> list=Arrays.asList(12,5,20,8,30,5,8);
		System.err.println(list);
	   Integer sortedList=list.stream().distinct().sorted((a,b)->a-b).toList().get(1);
	  System.out.println(sortedList);
		
	}

}
