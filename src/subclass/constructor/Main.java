package subclass.constructor;

class Main {
	public static void main(String[] args){
		new X();
		new X();
	}
}
class O{
	{
		System.err.println("<O initializer>");
	}
	O(){
		System.err.println("<O Constructor>");
	}
}

class X extends O{
	{
		System.err.println("<X Initializer>");
	}
	X(){
		System.err.println("<X Constructor>");
	}
}