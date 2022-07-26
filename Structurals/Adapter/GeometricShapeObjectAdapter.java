public class GeometricShapeObjectAdapter implements Shape{

    private GeometricShape _geometricShape;
    private String _name;

    public GeometricShapeObjectAdapter(String name, GeometricShape geometricShape){
        _geometricShape = geometricShape;
        _name = name;
    }

    @Override
    public double area() {
        return _geometricShape.getArea();
    }

    @Override
    public double perimeter() {
        return _geometricShape.getPerimeter();
    }

    @Override
    public String name(){
        return _name;
    }
    
}
