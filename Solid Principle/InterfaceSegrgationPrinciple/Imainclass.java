package InterfaceSegrgationPrinciple;

import InterfaceSegrgationPrinciple.solution.Phonepay;

public class Imainclass {
    public static void main(String []args)
    {
        Phonepay pp = new Phonepay();
        System.out.println(pp.getUpiTransaction("123"));
    }
}
