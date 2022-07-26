class Square implements Figure{
    
    @Override
    public void draw() {
        System.out.println("Square - draw");        
    }

    @Override
    public void getPerimeter() {
        System.out.println("Square - calulate surface");        
    }

    @Override
    public void getArea() {
        System.out.println("Square - getArea");                
    }
    
}    