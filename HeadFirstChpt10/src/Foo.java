public class Foo {
    int x = 12;

    public static void go(final int x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Foo f1 = new Foo();
        f1.go(23);
    }

}