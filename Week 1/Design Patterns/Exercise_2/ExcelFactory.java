
public class ExcelFactory extends DocumentFactory {
       @Override 
public Document CreateDocument(){
return new ExcelDocument();
}    
}
