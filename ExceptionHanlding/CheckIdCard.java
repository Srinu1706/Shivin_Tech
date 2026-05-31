package ExceptionHanlding;

public class CheckIdCard {

    static void verifyIdCard(String idCardNo)
            throws InvalidIdCardException {

        if (idCardNo == null || idCardNo.isEmpty()) {
            throw new InvalidIdCardException(
                    "ID Card Number is required. Access Denied!");
        }

        System.out.println("Access Granted");
    }

    public static void main(String[] args) {
        try {
            verifyIdCard("12345");
        } catch (InvalidIdCardException e) {
            System.out.println(e.getMessage());
        }
    }
}