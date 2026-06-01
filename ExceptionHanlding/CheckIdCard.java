package ExceptionHanlding;

public class CheckIdCard {

    static void verifyIdCard(String idCardNo)
            throws InvalidIdCardException {

        if (idCardNo == null || idCardNo.isEmpty()) {
            throw new InvalidIdCardException(
                    "ID Card Number is required. Access Denied!");
        }

        System.out.println("Access Granted "+idCardNo);
    }

    public static void main(String[] args) {
        try {
            verifyIdCard("SAI");
        } catch (InvalidIdCardException e) {
            System.out.println(e.getMessage());
        }
    }
}