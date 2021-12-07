import java.awt.geom.*;     // for Point2D.Double
import java.util.ArrayList; // for ArrayList
import gpdraw.*;            // for DrawingTool

public class IrregularPolygon{

  private ArrayList <Point2D.Double> myPolygon;
  private DrawingTool myPencil;
  
  // constructors
  public IrregularPolygon() { 
    myPencil = new DrawingTool(new SketchPad(500, 500));
  }

  // public methods
  public void add(Point2D.Double aPoint) { }
  public void draw() { }
  public double perimeter() { 
    return 0;
  }
  public double area() { 
    return 0;
  }
}
