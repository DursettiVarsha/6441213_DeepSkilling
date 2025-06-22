public class Test{
    public static void main(String[] args) {
        Notifier email = new EmailNotifier();
        Notifier emailWithSMS = new SMSNotifierDecorator(email);
        Notifier emailSMSAndSlack = new SlackNotifierDecorator(emailWithSMS);
        System.out.println("== Sending notification via Email + SMS + Slack ==");
        emailSMSAndSlack.send("System alert: CPU usage is high.");
    }
}
