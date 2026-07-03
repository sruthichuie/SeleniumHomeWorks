package org.testleaf.week1.day2;

public class LibraryManagement {
public static void main(String[] args) {
    Library l= new Library();
    System.out.println(l.addBook("The wings of fire"));
    l.issueBook();
}
}
