package OpenClosed;

public class OpenMainClass {
    public static void main( String []args)
    {
        CheckasUser checku = new CheckasUser();
        CheckasAdmin checka = new CheckasAdmin();
        CheckPass checkpa = new CheckPass();
        System.out.println(checku.check("user"));
        String t = checka.check("admin");
        if(t.substring(0,7).equals("Genuine"))
        {
            System.out.println(t);
            System.out.println(checkpa.checkPass("@123"));
        }
    }
}
