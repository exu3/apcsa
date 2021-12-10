import java.awt.geom.*;     // for Point2D.Double
import java.util.ArrayList; // for ArrayList
import gpdraw.*;            // for DrawingTool

public class IrregularPolygon{

  private ArrayList <Point2D.Double> myPolygon;
  private DrawingTool myPencil;
  
  // constructors
  public IrregularPolygon() { 
    myPencil = new DrawingTool(new SketchPad(500, 500));
    myPolygon = new ArrayList <Point2D.Double> ();
  }

  // public methods
  public void add(Point2D.Double aPoint) {
    myPolygon.add(aPoint);
  }
  public void draw() {

    for (int i=0; i<myPolygon.size(); i++) {
      myPencil.move(myPolygon.get(i).getX(), myPolygon.get(i).getY());
    }
    myPencil.move(myPolygon.get(0).getX(), myPolygon.get(0).getY());
  }

  public double perimeter() { 
    double distance = 0;

    for (int i=0; i<myPolygon.size()-1; i++) {
      Point2D.Double current = myPolygon.get(i);
      Point2D.Double next = myPolygon.get(i+1);
      // System.out.println(current.getX());
      // System.out.println(current.getY());
      double cx = current.getX();
      double nx = next.getX();

      double cy = current.getY();
      double ny = next.getY();
      distance = distance(cx, cy, nx, ny);
      
      // distance = Math.abs(cx-nx) + Math.abs(cy-ny);
    }
    return distance;
  }

  public double area() { 
    return 0;
  }
}
