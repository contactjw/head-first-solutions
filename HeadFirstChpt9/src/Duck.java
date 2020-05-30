public class Duck {
    int size;

    // Default Constructor
    public Duck() {
        size = 27;
    }

    //Overloaded Constructor
    public Duck(int duckSize) {
        System.out.println("Quack!");
        size = duckSize;
        System.out.println("Size is " + size);
    }
}

class useDuck {
    public static void main(String[] args) {
        Duck d = new Duck(42);
    }
}