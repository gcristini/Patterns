public class ProxyImage implements Image{

    private String _fileName;
    private RealImage _realImage;

    public ProxyImage(String fileName){
        _fileName = fileName;        
    }

    @Override
    public void show() {           
        if (_realImage == null){
            System.out.println("[PROXY IMAGE]: show()::image null");
            _realImage = new RealImage(_fileName);
        }
        _realImage.show();
        System.out.println("[PROXY IMAGE]: show()");
    }

}