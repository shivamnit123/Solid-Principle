package DependencyInversionPrinciple.solution;

public class CreditCardT implements BankCard{
    @Override
    public void doTransaction(int amount) {
        System.out.println("Credited successfully");
    }
}
