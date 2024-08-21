package email;

public class Main {
    public static void main(String[] args) {
        Email email = new SimpleEmail("alice@example.com", "bob@example.com", "Hello", "This is a test email.");
        
        // Add attachment
        email = new AttachmentDecorator(email, "file.txt");
        
        // Add encryption
        email = new EncryptionDecorator(email);
        
        // Add read receipt
        email = new ReadReceiptDecorator(email);
        
        // Send the email
        email.send();
    }
}
