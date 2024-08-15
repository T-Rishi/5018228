
public class TestFactoryMethod {
    public static void main (String args[])
    {
        DocumentFactory WordFactory = new WordFactory();
        DocumentFactory PdfFactory = new PdfFactory();
        DocumentFactory ExcelFactory = new ExcelFactory();
        
        Document Word =  WordFactory.CreateDocument();
        Document PDF = PdfFactory.CreateDocument();
        Document Excel =ExcelFactory.CreateDocument();
       
        
        Word.Open();
        PDF.Open();
        Excel.Open();
        
    }
}
