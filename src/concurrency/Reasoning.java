package concurrency;

class Reasoning implements Runnable {

    void distinguish() {
        System.out.println("A process is an execution of a program, while a thread is an execution within a process.");
        System.out.println(
                "When you invoke start(), java creates a new thread to run the code in; when you invoke run(), java runs the code on the current thread and doesn't create a new one.");
    }

    @Override
    public void run() {
        distinguish();
    }
}