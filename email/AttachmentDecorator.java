package email;

public class AttachmentDecorator extends EmailDecorator {
    private String attachment;

    public AttachmentDecorator(Email decoratedEmail, String attachment) {
        super(decoratedEmail);
        this.attachment = attachment;
    }

    @Override
    public void send() {
        super.send();
        System.out.println("With attachment: " + attachment);
    }
}

