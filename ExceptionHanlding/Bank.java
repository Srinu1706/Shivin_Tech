package ExceptionHanlding;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class Bank {
static void withDraw(double amount,double balance ) throws InsufficientBalanceException {
    if(amount>balance){
        throw new InsufficientBalanceException("please make sure sufficent Balance");
    }else{
        System.out.println("You have sucessfully withdrawal your ammount");
    }
}
public static void main(String[] args) {
    try{
        withDraw(1000, 5000);
    }catch(InsufficientBalanceException exception){
        System.out.println(exception.getMessage());
    }
}
}
