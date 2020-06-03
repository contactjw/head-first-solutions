class ExceptExamp extends Exception {}

public class ExceptTestDrive {

    static void doRisky(String t) throws ExceptExamp {
        System.out.print("h");
        if ("yes".equals(t)) {
            throw new ExceptExamp();
        }
        System.out.print("r");
        System.out.print("o");
    }

    public static void main(String[] args) {
        String test = args[0];
        System.out.print("t");

        try {
            doRisky(test);
        } catch (ExceptExamp e) {
            System.out.print("a");
        } finally {
            System.out.print("w");
            System.out.print("s");
        }

    }
}
