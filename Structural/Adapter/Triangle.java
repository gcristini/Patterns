public class Triangle implements Shape {
    private String name  = "";
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
        
    public Triangle(String name) {
        this.name = name;
    }
    public Triangle(String name, double side1, double side2, double side3) {
        this.name = name;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public String name(){
        return name;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
    
    @Override
    public double area() {
        // Heron's formula
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3) );
    }

    
}
