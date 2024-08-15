
import com.mycompany.decorator.NotifierDecorator;


public class SMS extends NotifierDecorator 
{
    public SMS (Notifier notifier){
            super(notifier);
    }
    
    public void Send (String msg)
    {
        super.Send(msg);
        sendSMS(msg);
    }
    
    private void sendSMS(String msg)
    {
        System.out.println("Sending the Message "+ msg +" as SMS");
    }
    
}
