package nonstaticmethod;

public class Method1 {
	//main method
	public static void main(String[] args) {
		System.out.println("Hi");
		//classname objectname=new classname();
		 Method1    g1        =new Method1();//step1:creat an object/
		                                     //instance of class
		 g1.m5();
		 
		 //Method1-->classname--->as a datatype(object type)
		 //g1-->objectName-->use to identify/refer object
		 //new-->keyword-->use to creat blank/empty object
		 //Method1()-->classname-->constructor-->use to copy all
		                  //the members of class into object
	}
	//non ststic-->regular method
	public void m5() {
		System.out.println("running non-static regular method m5 from same class");
	}

}
