package com.example.jade.s16;

public class ClassicClient {
    private DataService ds;

    public ClassicClient() {
        this.ds = new DataServiceOne();
    }

    public void doSomething() {
        System.out.println(ds.getData());
    }
}
