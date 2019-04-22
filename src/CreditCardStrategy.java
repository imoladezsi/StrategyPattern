
public class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String pinCode;
    private String dateOfExpiry;

    public CreditCardStrategy(String nm, String cardNr, String pin, String expiryDate){
        this.name=nm;
        this.cardNumber=cardNr;
        this.pinCode=pin;
        this.dateOfExpiry=expiryDate;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount +" paid with credit/debit card with number "+cardNumber+" and date of expiry "+ dateOfExpiry + " by "+ name);
    }

}
