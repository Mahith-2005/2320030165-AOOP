package email;

public class ReadReceiptDecorator extends EmailDecorator {

    public ReadReceiptDecorator(Email decoratedEmail) {
        super(decoratedEmail);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Requesting a read receipt...");
    }
}

