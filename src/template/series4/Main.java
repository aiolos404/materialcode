package template.series4;

interface Series{
	void next();
	void print();
}

class SeriesFactory{
	private SeriesFactory(){}
	public static Series newArith(){return new ArithSeries();}
	public static Series newGrom(){return new GeomSeries();}
}

abstract class AbstractSeries implements Series{
	int _x;//default is 0
	int _y = 1;
	public void next(){ _x++; _y=this.eval(_y,2);}
	public void print(){System.out.println("x=" + _x + "; y=" + _y);}
	
	abstract protected int eval(int x,int y);
}

class ArithSeries extends AbstractSeries{protected int eval(int x, int y){return x+y; }}
class GeomSeries extends AbstractSeries{protected int eval(int x, int y){return x*y; }}


public class Main{
	public static void main(String[] aiolos){
		Series x = SeriesFactory.newGrom();
		x.next();
		x.next();
		x.print();
	}
}