package types.point3;
import java.awt.Color;

interface Point{
	double getX();
	double getY();
}

final class CartesianPoint implements Point{
//	
}

final class PolarPoint implements Point{
//	
}

public class Main {
	private Main(){}
	pulic static void main(String[] args){
		CartesianPoint p1 = new CartesianPoint(0,0,Color.RED);
		CartesianPoint q1 = new CartesianPoint(1,1,Color.BLUE);
		PolarPoint r1 = new PolarPoint(0,0,Color.RED);

		Point p2 = p1;
		Point q2 = q1;
		Point r2 = r1;
	}
}
