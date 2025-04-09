package p1;

public class TestAccess {
    public static void main(String[] args) {
        AccessExample obj = new AccessExample();

        System.out.println(obj.defaultVar);
        System.out.println(obj.protectedVar);
        System.out.println(obj.publicVar);
//        System.out.println(obj.privateVar);
        System.out.println();
        System.out.println();
        obj.displayVariables();
    }
}
