// Basic interface example
public class Dog implements Pet {
    public void bark() {
        System.out.println("WOOF WOOF!");
    }

    public void beFriendly() {
        System.out.println("*Wags tail*");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.beFriendly();
    }
}

interface Pet {
    void beFriendly();  // interface methods are implicitly public and abstract
}

