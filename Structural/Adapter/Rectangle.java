public class Rectangle implements GeometricShape {
    private double side1 = 2.0;
    private double side2 = 1.0;    

    @Override
    public double getPerimeter() {        
        return 2*(side1 + side2);
    }

    @Override
    public double getArea() {
        return (side1 * side2);
    }
    
}
