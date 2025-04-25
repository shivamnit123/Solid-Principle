package InterfaceSegrgationPrinciple;

public class CrediCard implements Iprinciple{

    // here getUpiTransaction and checkUpi both method not used by this class......
    @Override
    public String getUpiTransaction(String upiId) {
        return null;
    }

    @Override
    public void checkUpi(String upiId) {

    }

    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }
}
