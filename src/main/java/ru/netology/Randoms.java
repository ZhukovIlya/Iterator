package ru.netology;

import java.util.Random;
import java.util.Iterator;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private int max;
    private int min;


    public Randoms(int min, int max) {
        this.max = max;
        this.min = min;
        this.random = new Random();
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt((max - min) + 1) + min;
            }
        };
    }
}
