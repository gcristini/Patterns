class Circle implements Figure{

    @Override
    public void draw() {
        System.out.println("Circle - draw");        
    }

    @Override
    public void getPerimeter() {
        System.out.println("Circle - calulate surface");        
    }

    @Override
    public void getArea() {
        System.out.println("Circle - getArea");                
    }
    
}    