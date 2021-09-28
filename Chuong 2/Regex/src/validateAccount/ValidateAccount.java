package validateAccount;

public class ValidateAccount {
    private static Example example;
    public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };

    public static void main(String[] args) {
        example = new Example();
        for (String account : validAccount){
            boolean isvalid = example.validate(account);
            System.out.println("Account is " + account + " is valid: " + isvalid);
        }
        for (String account : invalidAccount){
            boolean isvalid = example.validate(account);
            System.out.println("Account is " + account + " is valid: " + isvalid);
        }
    }
}
