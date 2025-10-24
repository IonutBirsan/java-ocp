package org.example.ch45.ex10;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("12345", "Java Book 1", "Ionut");
        Book book2 = new Book("12345", "Java Book 2", "Ionut2");
        Book book3 = new Book("12346", "Java Book 3", "Ionut3");

        System.out.println(book);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println(book.equals(book2));
        System.out.println(book.equals(book3));
    }
}
