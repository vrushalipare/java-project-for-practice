package methodsWithParameters;
//static regular method call from same class

public class Model3 {  //method with parameter
	public static void main(String[] args) {
		m1(10,20);
		m1(5,6);  //initialization
		m1(8,9);
	}
	//method with int int parameter
	public static void m1(int num1,int num2) {//declaration
		System.out.println("addition"+(num1+num2));
	}

}
