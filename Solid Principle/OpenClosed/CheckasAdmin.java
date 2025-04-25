package OpenClosed;

public class CheckasAdmin implements Openclose{
    @Override
    public String check(String id) {
        if(id.equals("admin"))
        {
            return "Genuine admin,now lets check pass";
        }
        return "Fake admin";
    }
}
