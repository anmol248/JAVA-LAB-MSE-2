package java16;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
//record Student(int sid,String name,String course) {};
public class MainRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s=new Student(1,"Student 1","MCA");
//		System.out.println(s.sid());
//		System.out.println(s.name());
//		System.out.println(s.course());
//		System.out.println(s);
		int data[]=new int[] {24,23,45,56};
		
		//List<Integer> list=Arrays.stream(data).boxed().collect(Collectors.toList());
		List<Integer> list=Arrays.stream(data).boxed().toList();//conversion of array to list using stream
		list.forEach((item)->System.out.println(item));; //concept of consumer function 
		list.forEach(System.out::println); //used method refrencing
	}

}
//final static declare with record and write direct constructor