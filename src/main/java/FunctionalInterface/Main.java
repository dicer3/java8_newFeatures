package FunctionalInterface;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        System.out.println("print ");

        MyInter i = () -> System.out.println("this is to print");

        i.sayHello();

        MyInter i2 = () -> System.out.println("this is to print new linw");
        i2.sayHello();
    }
}
