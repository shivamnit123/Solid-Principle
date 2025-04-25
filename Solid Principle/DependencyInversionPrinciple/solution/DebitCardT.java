package DependencyInversionPrinciple.solution;

public class DebitCardT implements BankCard{
    @Override
    public void doTransaction(int amount) {
        System.out.println("debit successfully");
    }
}
