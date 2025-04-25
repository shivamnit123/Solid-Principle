package solidPrinciple;

public class MainClass {
    public static void main(String []args)
    {
        Validations valid = new Validations();
        System.out.println(valid.checkUser("user"));
        System.out.println(valid.checkAdmin("admin"));
    }
}
