package p1;

public class AccessExample {
    private String privateVar = "privateVar";
    String defaultVar = "defaultVar";
    protected String protectedVar = "protectedVar";
    public String publicVar = "publicVar";

    public void displayVariables(){
        System.out.println(privateVar);
        System.out.println(defaultVar);
        System.out.println(protectedVar);
        System.out.println(publicVar);
    }
}
