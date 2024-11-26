package org.example;

import java.util.ArrayList;

public class FactorialContainer {
    private int n;

    public FactorialContainer(int n) {
        this.n = n;
    }

    public ArrayList<Integer> addElements() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n+1; i++) {
            list.add(count(i));
        }
        return list;
    }

    public int count(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
