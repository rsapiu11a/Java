package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Database singleton = Database.getInstance("FOO");
        Database anotherSingleton = Database.getInstance("BAR");
        System.out.println(singleton.getQuery());
        System.out.println(anotherSingleton.getQuery());
    }
}
