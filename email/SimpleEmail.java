package email;

public class SimpleEmail implements Email {
    private String sender;
    private String recipient;
    private String subject;
    private String body;

    public SimpleEmail(String sender, String recipient, String subject, String body) {
        this.sender = sender;
        this.recipient = recipient;
        this.subject = subject;
        this.body = body;
    }

    @Override
    public void send() {
        System.out.println("Sending Email:");
        System.out.println("From: " + sender);
        System.out.println("To: " + recipient);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
    }
}