public class EmailTest {
    private static Email email;
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String args[]) {
        email = new Email();
        for (String emails : validEmail) {
            boolean isvalid = email.validate(emails);
            System.out.println("Email is " + email + " is valid: " + isvalid);
        }
        for (String emails : invalidEmail) {
            boolean isvalid = email.validate(emails);
            System.out.println("Email is " + email + " is valid: " + isvalid);
        }
    }
}
