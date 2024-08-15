
public class TestSingleton {
    public static void main (String args []){
        Logger log1 = Logger.GetInstance();
        Logger log2 = Logger.GetInstance();
        
        log1 . DisplayLog("Hi, I'm The First Logger");
        log2 . DisplayLog("Hi, I'm The Second Logger");
        
        if (log1 == log2)
        System.out.println("We are of Same Instance");
        
        else 
         System.out.println("We are of Different Instance");
    
    }
}
