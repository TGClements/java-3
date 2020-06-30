package concurrency;

import java.util.*;

class TeamTC1 implements Runnable {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BRIGHT_BLACK = "\u001B[90m";
    public static final String ANSI_BRIGHT_RED = "\u001B[91m";
    public static final String ANSI_BRIGHT_GREEN = "\u001B[92m";
    public static final String ANSI_BRIGHT_YELLOW = "\u001B[93m";
    public static final String ANSI_BRIGHT_BLUE = "\u001B[94m";
    public static final String ANSI_BRIGHT_PURPLE = "\u001B[95m";

    List<String> team = new ArrayList<>();

    @Override
    public void run() {
        System.out.println(ANSI_BLACK + "Mark Bennett");
        team.add("Mark Bennett");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(ANSI_RED + "Aaron White");
        team.add("Aaron White");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(ANSI_GREEN + "Abram Jablonski");
        team.add("Abram Jablonski");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(ANSI_YELLOW + "Caleb Waters");
        team.add("Caleb Waters");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(ANSI_BLUE + "Cody Clark");
        team.add("Cody Clark");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(ANSI_PURPLE + "Gotham Katta");
        team.add("Gotham Katta");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(ANSI_CYAN + "John Bozarov");
        team.add("John Bozarov");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(ANSI_WHITE + "Justin Cheng");
        team.add("Justin Cheng");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(ANSI_BRIGHT_BLACK + "Kevin Keesee");
        team.add("Kevin Keesee");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(ANSI_BRIGHT_RED + "Korey Brooks");
        team.add("Korey Brooks");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(ANSI_BRIGHT_GREEN + "Matthew Choat");
        team.add("Matthew Choat");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(ANSI_BRIGHT_YELLOW + "Sarah");
        team.add("Sarah");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(ANSI_BRIGHT_BLUE + "Tyler G Clements");
        team.add("Tyler G Clements");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(ANSI_BRIGHT_PURPLE + "Zach");
        team.add("Zach");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        System.out.println(ANSI_RESET + team);
    }
}