import java.util.HashMap;

public class FigureFactory {
    
    public enum FigureType{
        CIRCLE,
        SQUARE,
        RECTANGLE
    }

    HashMap<FigureType, Figure> figureMap = new HashMap<>();
    
    public FigureFactory(){
        figureMap.put(FigureType.CIRCLE, new Circle());
        figureMap.put(FigureType.SQUARE, new Square());
        figureMap.put(FigureType.RECTANGLE, new Rectangle());        
    }

    public Figure drawFigure(FigureType figureType){
        return figureMap.get(figureType);        
    }
    
}
