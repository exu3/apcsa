import java.awt.geom.*;

public class Main{
	public static void main(String [] args)
	{
		IrregularPolygon tc2 = new IrregularPolygon();
        tc2.add(new Point2D.Double(0, 100));
        tc2.add(new Point2D.Double(10, 0));
        tc2.add(new Point2D.Double(20, 100));
        tc2.add(new Point2D.Double(30, 0));
        tc2.add(new Point2D.Double(40, 100));
        tc2.add(new Point2D.Double(50, 0));
        tc2.add(new Point2D.Double(60, 100));
        tc2.add(new Point2D.Double(70, 0));
        tc2.add(new Point2D.Double(80, 100));
        tc2.add(new Point2D.Double(90, 0));
        tc2.add(new Point2D.Double(100, 100));
        tc2.add(new Point2D.Double(90, 200));
        tc2.add(new Point2D.Double(-200, 100));
        tc2.add(new Point2D.Double(-100, 50));


        System.out.println("Perimeter is " + tc2.perimeter());
        System.out.println("Area is " + tc2.area());
        tc2.draw();
	}
}
