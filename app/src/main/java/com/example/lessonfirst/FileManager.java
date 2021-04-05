package com.example.lessonfirst;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class FileManager {
    String text = "Tanya";

    public void setDataToFile(String textt) {
        try (FileOutputStream outPut = new FileOutputStream("‪D:\\Android Studio\\file.txt")) {
            byte[] buffer = text.getBytes();
            outPut.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
        }
    }

    public String getDataFromFIle() {
        try {
            FileInputStream fileInPut = new FileInputStream("‪D:\\Android Studio\\file.txt");
            InputStreamReader reader = new InputStreamReader(fileInPut);
            BufferedReader buff = new BufferedReader(reader);
            StringBuffer strBuff = new StringBuffer();
            String lines;
            while ((lines = buff.readLine()) != null) {
                strBuff.append(lines);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}

