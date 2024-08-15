
public class Logger {
    
    private static Logger logger ;
    
    public static Logger GetInstance(){
        if(logger == null)
            logger = new Logger();
        
        return logger;
    } 
    
  
    
    public void DisplayLog(String msg){
        System.out.println("Log Message :" + msg);
    }   
    
    
}
