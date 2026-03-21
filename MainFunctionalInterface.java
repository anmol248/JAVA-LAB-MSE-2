//package funcInter;
////functional interface is a type of interface that contains only one abstract method and decleared with anotation FunctionalInterface
//@FunctionalInterface
//interface Add{
//	int calculate(int n1,int n2);	
//}
//public class MainFunctionalInterface {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	
//		Add a1=(int n1,int n2)->(n1+n2);//lambda expression with para and return single line
//		
//			System.out.println("Sum="+a1.calculate(23, 21));
//		}
//	}
//
//
//package funcInter;
////functional interface is a type of interface that contains only one abstract method and decleared with anotation FunctionalInterface
//@FunctionalInterface
//interface Calc{
//	void calculate();	
//	
//	
//	
//}
//public class MainFunctionalInterface {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	
//		//Add a1=(int n1,int n2)->(n1+n2);//lambda expression with para and return single line
//		Calc a2=()->{
//			int num1=5,num2=8;
//			System.out.println(num1+num2);
//		};
//		a2.calculate();
//		
//		}
//	}

package funcInter;
//functional interface is a type of interface that contains only one abstract method and decleared with anotation FunctionalInterface
@FunctionalInterface
//interface Calc{
//	int calculate(int num1 ,int num2);	
//	
//	
//	
//}
//public class MainFunctionalInterface {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	
//		//Add a1=(int n1,int n2)->(n1+n2);//lambda expression with para and return single line
//		Calc a2=(int num1, int num2)->(num1+num2);
//		a2.calculate(5,6);
//		
//		}
//	}

interface Voter{
	void vote(int num1);	
}
class VoterList{
	void checkVoterList(int ageValue) {
		if (ageValue >=18) {
			System.out.println("valid for vote");}
			else {
				System.out.println("not valid");
			}
	}
}
public class MainFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Voter a2= num1->{
			if (num1 >=18) {
			System.out.println("valid for vote");}
			else {
				System.out.println("not valid");
			}
			};
		a2.vote(19);
		VoterList v1=new VoterList();
		Voter v2=v1::checkVoterList;
		v2.vote(17);
		
		}
	}
