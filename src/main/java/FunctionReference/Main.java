package FunctionReference;

public class Main {
    public static void main(String[] args) {
        System.out.println("Learning Method Refernce");
        WorkInter workInter = () -> {
            System.out.println("this is new task do method");
        };

        workInter.doTask();

        WorkInter workInter1 = Stuff::doSuff;
        workInter1.doTask();

        Stuff ob = new Stuff();
        Runnable runnable1 = ob::printNumber;
        Thread d = new Thread(runnable1);
        d.start();
    }
}
