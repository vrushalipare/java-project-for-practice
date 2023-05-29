package nonstaticmethod;

public class Method2 {
	public static void main(String[] args) {
		System.out.println("Shreeya");
		Method2 N = new Method2();  //N-name
		N.GN();
		
		
		
		
	}
	public void GN() {  //GN-girl name
		System.out.println("running non static regular method GN from same class");
	}

}
