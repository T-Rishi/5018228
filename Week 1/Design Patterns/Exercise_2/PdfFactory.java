
public class PdfFactory extends DocumentFactory {
       @Override 
public Document CreateDocument(){
return new PdfDocument();
}    
}
