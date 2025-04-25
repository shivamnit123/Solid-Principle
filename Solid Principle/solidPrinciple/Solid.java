package solidPrinciple;

public class Solid {

    private String id;
    private String pass;

    public Solid(String id, String pass) {
        this.id = id;
        this.pass = pass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

//    public String checkUser(String id)
//    {
//        if(id=="user")return "Genuine User";
//        return "Fake user";
//    }

    // this violates single responsibility principle..as there are more than one  responsibility in a single class.
    // it manages user credentials as well as validations....

//    public String checkAdmin(String id)
//    {
//        if(id=="admin")return "Genuine Admin";
//        return "Fake admin";
//    }
}
