package sublclass.ex7;
//super could pass the parameter to the parent class
public class M {
	public static void main(String[] argv){
		new B(1);
		new C();
	}
}

class A{
	A(int i){System.out.println("A("+i+")");}
}

class B extends A{
	B(int i){
		super(i);
		System.out.println("B("+i+")");
	}
}
class C extends B{
	C(){
		super(0);
		System.out.println("C");
	}
}