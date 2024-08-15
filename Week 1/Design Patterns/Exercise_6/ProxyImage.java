
public class ProxyImage implements Image {
    private String FileName;
    private RealImage RealImage;

    public ProxyImage(String FileName) {
        this.FileName = FileName;
    }

    @Override
    public void display() {
        if (RealImage == null) {
            RealImage = new RealImage(FileName);
        }
        RealImage.display();
    }
    
}
