package clone.magic;

public class Main {
	public static void main(String[] aiolos) throws CloneNotSupportedException{
		B x = new B(42,27);
		System.out.println(x);
		System.out.println(new A(x));
		System.out.println(x.copy());
		System.out.println(x.clone());
		
	}
}

class A implements Cloneable{
	int _i;
	public A(int i){_i = i;}
	
	public A(A that){ _i = that._i;}
	
	public Object copy(){return new A(_i);}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public String toString(){return "A(" +_i+")";}
}

class B extends A{
	int _j;
	public B(int i, int j){super(i);_j=j;}
	public String toString(){return "B(" +_i+ "," +_j+ ")";}
}