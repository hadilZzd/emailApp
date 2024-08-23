public class emailApp {

    public static void main(String[] args) {
        Email eml = new Email("Hadil", "Zaoudi");
        eml.setMailboxCap(500);
        System.out.println(eml.getMailboxCap());
    }
}