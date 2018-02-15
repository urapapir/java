package ru.spbstu.telematics.java;

import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class MatrixGenerator {
    static int[][] _matrix;
    static class generator implements Runnable
    {
        int i;
        int j;
        public generator(int i, int j)
        {
            this.i=i;
            this.j=j;
        }
        public void run() {
            _matrix[i][j] = (int)(Math.random()*(31));
        }
    }
    public static int[][] generate(int[][] matrix) {
        LinkedList<Thread> threads = new LinkedList<Thread>();
        _matrix=matrix;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                Integer I = i;
                Integer J = j;
                Thread t = new Thread(new generator(i,j));
                t.start();
                threads.add(t);
            }
        }
        try {
            for (Thread t : threads) {
                t.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _matrix=null;
        return matrix;
    }

}