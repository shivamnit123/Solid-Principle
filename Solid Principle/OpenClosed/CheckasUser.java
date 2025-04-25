package OpenClosed;

public class CheckasUser implements Openclose{
    @Override
    public String check(String id) {
        if(id.equals("user"))return "Genuine user";
        return "Fake user";
    }
}
