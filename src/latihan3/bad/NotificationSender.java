package latihan3_lsp.bad;

public class NotificationSender {
    public boolean send(String recipient, String message) {
        System.out.println("Sending generic notification to " + recipient);
        return true;
    }
}