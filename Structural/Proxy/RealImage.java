public class RealImage implements Image{

    private String _fileName;

    public RealImage(String filename){
        _fileName = filename;
        this.loadImage();
    }

    @Override
    public void show() {
        System.out.println("[REAL IMAGE]: show(): " + _fileName);
    }

    private void loadImage(){
        System.out.println("[REAL IMAGE]: load(): " + _fileName);
    }
            
}
