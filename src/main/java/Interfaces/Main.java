package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("History of Ukraine");
        Book book2 = new Book("Tales");
        Book book3 = new Book("Lord of the rings");
        Magazine magazine1 = new Magazine("Cosmopolitan");
        Magazine magazine2 = new Magazine("Young lady");
        Magazine magazine3 = new Magazine("News");

        List<Printable> shopList = new ArrayList<>();
        shopList.add(book1);
        shopList.add(book2);
        shopList.add(book3);
        shopList.add(magazine1);
        shopList.add(magazine2);
        shopList.add(magazine3);

        for (Printable x : shopList) {
            x.print();
        }
        Book.printBooks(shopList);
        Magazine.printMagazines(shopList);
        //System.out.println(book1 instanceof Book);
       // System.out.println(book2 instanceof Book);
       // System.out.println(book3 instanceof Book);
        //System.out.println(magazine1 instanceof Magazine);
       // System.out.println(magazine2 instanceof Magazine);
       // System.out.println(magazine3 instanceof Magazine);
    }
}
