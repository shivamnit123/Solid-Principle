package InterfaceSegrgationPrinciple.solution;

public class Phonepay implements TransactionInterface,UpiInterface{
    @Override
    public void payMoney() {

    }

    @Override
    public String getUpiTransaction(String upiId) {
        return null;
    }

    @Override
    public void checkUpi(String upiId) {

    }
}
