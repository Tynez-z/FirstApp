package com.example.lessonfirst;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileManager {
    String text = "Hello world!";

    public void setDataToFile(String text) {
        try (FileOutputStream outPut = new FileOutputStream("‪D:\\Android Studio\\file.txt")) {
            byte[] buffer = text.getBytes();
            outPut.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
        }
    }

    public String getDataFromFIle() {
        try (FileInputStream inPut = new FileInputStream("‪D:\\Android Studio\\file.txt")) {
            inPut.available();
            int i = -1;
            while ((i = inPut.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
}