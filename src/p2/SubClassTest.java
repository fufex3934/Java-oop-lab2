package p2;

import p1.AccessExample;

public class SubClassTest extends AccessExample {
    public static void main(String[] args) {
        SubClassTest obj = new SubClassTest();

        System.out.println(obj.protectedVar);
        System.out.println(obj.publicVar);

        System.out.println();
        System.out.println();

        obj.displayVariables();
    }
}
