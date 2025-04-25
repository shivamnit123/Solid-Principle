package solidPrinciple;

public class Validations {
    public String checkUser(String id)
    {
        if(id.equals("user"))return "Genuine User";
        return "Fake user";
    }
    public String checkAdmin(String id)
    {
        if(id.equals("admin"))return "Genuine admin";
        return "Fake admin";
    }
}
