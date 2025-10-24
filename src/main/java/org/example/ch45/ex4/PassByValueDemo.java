package org.example.ch45.ex4;

public class PassByValueDemo {

    public void modify(String name) {
        System.out.println("In modify method ->Before: " + name);
        name = "Name CHnaged";
        System.out.println("In modify method ->After: " + name);
    }

    public void modifyArray(int[] arr) {
        System.out.println("In modifyArray method ->Before: " + arr[0]);
        arr[0] = 21;
        System.out.println("In modifyArray method ->After: " + arr[0]);
    }

    public static void main(String[] args) {

        PassByValueDemo demoValue = new PassByValueDemo();

        String name = "Ionut";
        System.out.println(name);

        demoValue.modify(name);
        System.out.println(name);

        int[] arr = {5, 6, 7};
        System.out.println(arr[0]);
        demoValue.modifyArray(arr);
        System.out.println(arr[0]);

    }

}
