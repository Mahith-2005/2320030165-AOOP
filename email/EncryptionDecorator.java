package email;

public class EncryptionDecorator extends EmailDecorator {

    public EncryptionDecorator(Email decoratedEmail) {
        super(decoratedEmail);
    }

    @Override
    public void send() {
        System.out.println("Encrypting email...");
        super.send();
        System.out.println("Email sent with encryption.");
    }
}

