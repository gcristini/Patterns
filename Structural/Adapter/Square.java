public class Square implements Shape {
    private String name = "";
    private double side = 1.0;
      
    public Square(String name) {
      this.name = name;
    }
    
    public Square(String name, double side) {
      this.name = name;
      this.side = side;
    }
   
    @Override
    public String name(){
      return name;
    }

    @Override
    public double perimeter() {
      return 4 * side;
    }
   
    @Override
    public double area() {
      return side * side;
    }
}