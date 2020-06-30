package concurrency;

public class Main {

    public static void main(String[] args) {
        //run all of your threads from this main class.

        Reasoning r = new Reasoning();
        Thread t1 = new Thread(r);
        r.run();

        TeamTC1 tc1 = new TeamTC1();
        Thread t2 = new Thread(tc1, "Code Connoisseurs");
        tc1.run();
        System.out.println(t2.getName());
    }
}