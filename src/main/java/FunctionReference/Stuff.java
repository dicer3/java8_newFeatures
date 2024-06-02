package FunctionReference;

import java.time.LocalDate;

public class Stuff {
    public static void doSuff() {
        System.out.println("Laerning Method refernces ...");
        System.out.println("I am second line");
        LocalDate now = LocalDate.now();
        System.out.println(now.toString());
    }

    public static void threadTask(){
        for(int i=1;i<=10;i++){
            System.out.println(i*2);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void printNumber() {
        for(int i=1;i<=10;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
