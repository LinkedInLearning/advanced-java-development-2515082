package _05_03.end;

public class Main {

    public static void main(String[] args) {

        Thread threadOne = new Thread(new RunnableExample());
        Thread threadTwo = new Thread(() -> System.out.println("Hello world from a lambda style runnable"));

        threadOne.setName("First thread");
        threadTwo.setName("Second thread");

        threadOne.start();
        threadTwo.start();
    }

}
