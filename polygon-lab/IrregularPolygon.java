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

    myPencil.up();
    myPencil.move(myPolygon.get(0).getX(),myPolygon.get(0).getY());
    myPencil.down();
    for(int i=1;i<myPolygon.size();i++){
      myPencil.move(myPolygon.get(i).getX(),myPolygon.get(i).getY());
    }
    myPencil.move(myPolygon.get(0).getX(),myPolygon.get(0).getY());

  }

  public double distance(double x1, double y1, double x2, double y2){
    return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
  }

  public double perimeter() { 
    double perimeter = 0;
    for (int i =0;i < myPolygon.size()-1;i++){
      perimeter +=distance(myPolygon.get(i).getX(), myPolygon.get(i).getY(), myPolygon.get(i+1).getX(), myPolygon.get(i+1).getY());
    }
    perimeter += distance(myPolygon.get(myPolygon.size()-1).getX(), myPolygon.get(myPolygon.size()-1).getY(),myPolygon.get(0).getX(), myPolygon.get(0).getY() );
    return perimeter;
  }

  public double area() { 
    double area = 0;
    for (int i = 0; i < myPolygon.size()-1; i ++ ){
      area += ((myPolygon.get(i).getX()*myPolygon.get(i+1).getY())-(myPolygon.get(i+1).getX()*myPolygon.get(i).getY()));
    }
    area += ((myPolygon.get(myPolygon.size()-1).getX()*myPolygon.get(0).getY())-(myPolygon.get(0).getX()*myPolygon.get(myPolygon.size()-1).getY()));
    return Math.abs(area/2);
  }
}
