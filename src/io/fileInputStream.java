package io;

import java.io.*;

public class fileInputStream {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream i = new FileInputStream("E://java//1.jpg");
        System.out.println(i);

    }

}
