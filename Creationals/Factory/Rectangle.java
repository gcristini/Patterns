class Rectangle implements Figure{

    @Override
    public void draw() {
        System.out.println("Rectangle - draw");
    }

    @Override
    public void getPerimeter() {
        System.out.println("Rectangle - calulate surface");
    }

    @Override
    public void getArea() {
        System.out.println("Rectangle - getArea");
    }
    
}    