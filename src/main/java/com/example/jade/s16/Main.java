package com.example.jade.s16;

public class Main {
    public static void main(String[] args) {
        System.out.print("Classic client: ");
        new ClassicClient().doSomething();

        System.out.print("DI client: ");
        Injector.createClient().doSomething();
    }
}
