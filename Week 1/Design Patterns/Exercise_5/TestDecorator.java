
public class TestDecorator {
    public static void main (String args[])
    {
         Notifier emailNotifier = new EmailNotifier();

        Notifier SMS= new SMS(emailNotifier);
        Notifier Slack = new Slack(emailNotifier);

        System.out.println("Sending notification via Email:");
        emailNotifier.Send("Hello, this is an email notification!");

        System.out.println("\nSending notification via Email and SMS:");
        SMS.Send("Hello, this is a notification via Email and SMS!");

        System.out.println("\nSending notification via Email, SMS, and Slack:");
        Notifier allNotifier = new Slack(SMS);
        allNotifier.Send("Hello, this is a notification via Email, SMS, and Slack!");
    
    }
}
