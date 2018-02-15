package ru.spbstu.telematics.java;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class MatrixGeneratorTest {

    private static int[][] result;


    boolean check(int[][]m)//проверка что все числа не одинаковые и входят в заданный промежуток
    {
        int same=m[0][0];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if(m[i][j]!=same)return true;
                if(m[i][j]>30||m[i][j]<0)return false;
            }
        }
        return false;
    }

    @Test
    public void test() throws Exception {
        int[][]matrix=new int[8][5];
        result = MatrixGenerator.generate(matrix);
        assertTrue(check(result));
    }

}
