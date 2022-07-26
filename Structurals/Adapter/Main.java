class Main {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();
        
        calculator.addShape(new Triangle("Triangle-pippo"));
        calculator.addShape(new Square("Square-pluto"));
        calculator.addShape(new GeometricShapeObjectAdapter("Rectangle-paperino", new Rectangle()));
        
        calculator.perimeters();
        calculator.areas();
    }
}
    

