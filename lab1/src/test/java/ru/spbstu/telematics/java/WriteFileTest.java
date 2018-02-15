package ru.spbstu.telematics.java;

import jdk.internal.util.xml.impl.ReaderUTF8;
import org.junit.Test;

import java.io.*;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class WriteFileTest {

    @Test
    public void Test(){
        String text="Some String\nSecond Line";
        String result=null;
        try
        {
            WriteFile.write("test.txt", text);

            FileInputStream inFile = new FileInputStream("test.txt");
            byte[] str = new byte[inFile.available()];
            inFile.read(str);
            result = new String(str);

            File file=new File("test.txt");
            file.delete();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
            System.out.println("\nFile writing failed");

        }
        assertEquals("Write test failed", text, result);
    }

}