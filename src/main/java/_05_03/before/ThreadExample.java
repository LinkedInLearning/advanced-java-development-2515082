package _05_03.before;

public class ThreadExample extends Thread {


    @Override
    public void run() {
        System.out.println("Hello World from " + this.getName());
    }


}
