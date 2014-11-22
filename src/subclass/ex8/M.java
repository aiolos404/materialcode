package subclass.ex8;
//When a class A extends from another class B, when A runs, then run B first. 
//this pass the parameter to itself.
public class M {
	public static void main(String[] argv){
		new B();
		new C();
	}
}

class A{
	A(){System.out.println("A()");}
}
class B extends A{
	B(){
		this(1);
		System.out.println("B()");
	}
	B(int x){System.out.println("B("+x+")");}
}

class C extends B{
	C(){System.out.println("C()");}
}