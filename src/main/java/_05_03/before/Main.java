package _05_03.before;


public class Main {

    public static void main(String[] args) {

        Thread threadOne = new ThreadExample();
        Thread threadTwo = new ThreadExample();

        threadOne.setName("First thread");
        threadTwo.setName("Second thread");

        threadOne.start();
        threadTwo.start();
    }

}
