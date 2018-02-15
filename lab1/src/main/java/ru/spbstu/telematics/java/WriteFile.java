package ru.spbstu.telematics.java;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class WriteFile
{
    public static void main( String[] args )
    {
        System.out.println( "Hello_World!"  );
    }

    static void write(String path, String text) throws IOException
    {
        FileWriter writer=new FileWriter(path);
        for(int i = 0;i<text.length();i++)
            writer.write(text.charAt(i));
        writer.close();
    }

}
