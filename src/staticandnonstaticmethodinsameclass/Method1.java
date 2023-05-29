package staticandnonstaticmethodinsameclass;

public class Method1 {
	public static void main(String[] args) {
	//1.static regular method call from same class-->methodname();
		m1();
 //2.static regular method call from different class-->
	Method2.m2();	//classname.methodname();
		
//3.non static regular method call from same class
Method1 m7=new Method1();		                 //step1:creat an object same class
	m7.m3();	              //step2:method call-->objectname.methodname()
//4:nonstatic regular method call from different class
	Method2 s8=new Method2();	             //creat an object of different class
	s8.m4();	           //step2:method call-->differentobjectname.methodname
	}
	public static void m1() {
		System.out.println("running static regular method m1: from same class");}
	
	  public void m3() {
 System.out.println("running non static regular m3:from  same class");
	}

}
