package Mref;
class Calculator{
	Calculator(){
		System.out.println("this is constructor!");
	}
	Calculator(int n1,int n2){
		System.out.println("Devision="+n1/n2);
	}
	int sub(int n1,int n2) {
		return n1-n2;
	}
	static int mul(int n1,int n2) {
		return n1*n2;
	}
}
@FunctionalInterface
interface Calc{
	void cal();
}
public class MethodRefMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
//		int r=c.sub(100, 25);
//		System.out.println("Substraction="+r);
//		Calc c1=c::sub;
//		int s1=c1.cal(100, 25);
//		System.out.println("Substraction="+s1);
//		Calc c2=Calculator::mul;
//		int m1=c2.cal(100, 25);
//		System.out.println("Substraction="+m1);
		Calc c3= Calculator ::new;
		c3.cal();
		
	}

}
