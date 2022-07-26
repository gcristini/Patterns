import java.util.ArrayList;
import java.util.List;

public class ShapeCalculator {

    List<Shape> shapes = new ArrayList<Shape>();
    public void addShape(Shape shape) {
        shapes.add(shape);
    }
	
    public void areas() {
        shapes.stream().forEach(shape -> System.out.println( shape.name() + " area: " + shape.area()));
    }
	
    public void perimeters() {
        shapes.stream().forEach(shape -> System.out.println( shape.name() + " perimeter: " + shape.perimeter()));
    }	
}