package email;

public abstract class EmailDecorator implements Email {
    protected Email decoratedEmail;

    public EmailDecorator(Email decoratedEmail) {
        this.decoratedEmail = decoratedEmail;
    }

    public void send() {
        decoratedEmail.send();
    }
}
