package basics.composition;
import java.util.Random;

final class Person {
	static private Random _random = new Random();
	final private String _name;
	public Person(){ _name = Integer.toString(_random.nextInt());}
	public String toString(){ return "Person(" + _name + ")" ; }
}
