package Interfaces;

import java.util.List;

public class Magazine implements Printable {
    private String magazineName;

    public Magazine(String name) {
        this.magazineName = name;
    }

    public void print() {
        System.out.println("This is a magazine! "+magazineName);
    }

    public static void printMagazines(List<Printable> printable) {
        for (Printable x : printable) {
            if (x instanceof Magazine) {
               x.print();
            }
        }
    }
}
