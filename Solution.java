package com.javarush.task.task18.task1808;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        FileInputStream input = new FileInputStream(scanner.nextLine());
        FileOutputStream put = new FileOutputStream(scanner.nextLine());
        FileOutputStream singl = new FileOutputStream(scanner.nextLine());

        while(input.available() > 0)
        {
            byte[] byt = new byte[1000];
            int count = input.read(byt);
            put.write(byt, 0, count - count/2);
            singl.write(byt, count - count/2, count/2);
        }
        input.close();
        put.close();
        singl.close();

    }
}
