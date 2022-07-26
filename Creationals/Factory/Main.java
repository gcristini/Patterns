public class Main {
    
    public static void main (String[] args){
        FigureFactory figureFactory = new FigureFactory();
        Figure circle = figureFactory.drawFigure(FigureFactory.FigureType.CIRCLE);
        Figure square = figureFactory.drawFigure(FigureFactory.FigureType.SQUARE);
        Figure rectangle = figureFactory.drawFigure(FigureFactory.FigureType.RECTANGLE);

        System.out.println("\nFIGURE CIRCLE:");
        circle.draw();
        circle.getPerimeter();
        circle.getArea();

        System.out.println("\nFIGURE SQUARE:");
        square.draw();
        square.getPerimeter();
        square.getArea();

        System.out.println("\nFIGURE RECTANGLE:");
        rectangle.draw();
        rectangle.getPerimeter();
        rectangle.getArea();
    }      
}
