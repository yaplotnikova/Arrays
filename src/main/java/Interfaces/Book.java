package Interfaces;

import java.util.List;

public class Book implements Printable {
    private String bookName;

    public Book(String name) {
        this.bookName = name;

    }

    public void print() {
        System.out.println("This is a book! ");
    }

    public static void printBooks(List<Printable> printable) {
        for (Printable x : printable) {
            if (printable instanceof Book) {
                ((Book) printable).print();
            }
        }
    }
}
