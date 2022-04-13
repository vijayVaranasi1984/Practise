package inher;

public class B extends A {

    int i = 20;

    {
        System.out.println(2);
    }

    String s = "Class B";

    {
        System.out.println(super.s);
    }
}
