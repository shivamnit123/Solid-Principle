package DependencyInversionPrinciple;

import DependencyInversionPrinciple.solution.BankCard;
import DependencyInversionPrinciple.solution.CreditCardT;
import DependencyInversionPrinciple.solution.DebitCardT;

public class Shopping {

  //  private Credit credit;
    // private Debit debit;    ----like this
//    public Shopping(Credit credit) {
//        this.credit = credit;
//    }

    BankCard bankcard;

    public Shopping(BankCard bankcard) {
        this.bankcard = bankcard;
    }

    public void purchase(int amount)
    {
       bankcard.doTransaction(amount);
    }

    // what if creditcard not works here....u have too manually remove credit oject from here
    // and manually add debit card for transaction..so this indicates that your class is tightly coupled...
    // to make it loosely coupled....u have to apply dependency inversion principle
    public static void main(String []args)
    {
//        CreditCardT creditcard = new CreditCardT();
//        DebitCardT debitcard = new DebitCardT();
        BankCard bankcard = new DebitCardT();  // in run time u decide what object u have going to create
        Shopping shopping = new Shopping(bankcard);
        shopping.purchase(100);
    }

}
