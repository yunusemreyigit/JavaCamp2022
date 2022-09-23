package CreditManagement;

public class Main {
    public static void main(String[] args) {
        CreditUI creditUI = new CreditUI();
        creditUI.crediCalculate(new AgricultureLoanManager());
    }
}
