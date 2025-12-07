package com.company.superthis;

public class Astar {
    int a;
    int b;
    int c;
    int z;

    public Astar() {
        z = 1;
    }

    public Astar(int a) {
        this();
        this.a = a;
    }

    public Astar(int a, int b) {
        this(a);
        this.b = b;
    }

    public Astar(int a, int b, int c) {
        this(a,b);
        this.c = c;
    }
    //...
}
