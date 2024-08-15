
import com.mycompany.decorator.NotifierDecorator;


public class Slack extends NotifierDecorator{
    public Slack(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void Send(String msg) {
        super.Send(msg);
        sendSlack(msg);
    }

    private void sendSlack(String msg) {
        System.out.println("Sending the Message "+ msg +" in Slack");
    }
}
