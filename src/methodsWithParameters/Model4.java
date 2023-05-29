package methodsWithParameters;
//non static regular method call from same class

public class Model4 {
	public static void main(String[] args) {
		Model4 multi=new Model4();
	multi.m1(2,9);
	multi.m1(5,7);
	multi.m1(6, 6);

	Model5 info=new Model5();
	info.G1("Gita",25,87.5f,'A');//non static method call from different class
	
	}
 public void m1(int num1,int num2) {
	 System.out.println("multiplication"+" "+(num1*num2));
	 
 }
}
