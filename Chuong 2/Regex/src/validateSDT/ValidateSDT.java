package validateSDT;

public class ValidateSDT {
    private static Example example;
    public static final String[] validPhoneNumber = new String[]{"8466837259"};
    public static final String[] invalidPhoneNumber = new String[]{"a822222222"};

    public static void main(String[] args) {
        example = new Example();
        for (String phoneNumber : validPhoneNumber){
            boolean isvalid = example.validate(phoneNumber);
            System.out.println("Phone number is "+ phoneNumber +" is valid: " + isvalid);
        }
        for (String phoneNumber : invalidPhoneNumber){
            boolean isvalid = example.validate(phoneNumber);
            System.out.println("Phone number is "+ phoneNumber +" is valid: " + isvalid);
        }
    }
}
