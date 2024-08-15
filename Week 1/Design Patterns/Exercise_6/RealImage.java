
public class RealImage implements Image {
    private String FileName;
    
    public RealImage(String FileName){
        this.FileName = FileName;
        LoadFromDisk();  
    }
    
    private void LoadFromDisk(){
        System.out.println("Loading the Image From Disk: "+FileName);
    }
    
    public void display()
    {
        System.out.println("Displaying The Image" + FileName);
    }
    
}
