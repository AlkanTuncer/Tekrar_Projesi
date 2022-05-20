package day056.task_B2B_CRM;

public class InsufficientBalanceException extends Exception{

    public InsufficientBalanceException() {
        super("Insufficient balance for the requested transaction.");
    }
}
