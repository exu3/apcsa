import java.awt.geom.*;

public class Main{
	public static void main(String [] args)
	{
		IrregularPolygon testCase = new IrregularPolygon();
		testCase.add(new Point2D.Double(20, 10));
		testCase.add(new Point2D.Double(70, 20));
		testCase.add(new Point2D.Double(50, 50));
		testCase.add(new Point2D.Double(0, 40));
		//uncomment when you are ready to test the perimeter area or draw
		System.out.println("Perimeter: " + testCase.perimeter());
		System.out.println("Area: " + testCase.area());
		testCase.draw();
	}
}
