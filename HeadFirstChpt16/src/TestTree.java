import java.util.*;

public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
    }

    class BookComparator implements Comparator<Book> {
        public int compare(Book one, Book two) {
            return one.title.compareTo(two.title);
        }
    }

    public void go() {
        Book b1 = new Book("How Cats Work");
        Book b2 = new Book("Remix your Body");
        Book b3 = new Book("Finding Emo");

        BookComparator bc = new BookComparator();
        TreeSet<Book> tree = new TreeSet<Book>(bc);
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }
}

class Book {
    String title;
    public Book(String t) {
        title = t;
    }

//    public int compareTo(Book one) {
//        return this.title.compareTo(one.title);
//    }
}
