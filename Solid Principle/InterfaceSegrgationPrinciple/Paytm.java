package InterfaceSegrgationPrinciple;

public class Paytm implements Iprinciple{
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

    // suppose there is no need of this method here...I forced it to put this method here..which is wrong as per Interface segregation rule
    @Override
    public void getScratchCard() {

    }
}
