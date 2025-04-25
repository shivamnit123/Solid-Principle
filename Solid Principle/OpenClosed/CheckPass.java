package OpenClosed;

public class CheckPass {
    public String checkPass(String pass)
    {
        if(pass.equals("@123"))return "pass match";
        return "pass failed";
    }
}
