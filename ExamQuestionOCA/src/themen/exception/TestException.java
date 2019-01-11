package themen.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestException {

    public static void main(String[] args) {
        TestException te = new TestException();
        te.exampleCheckedException();
        te.exampleUncheckedException();
    }

    public void exampleCheckedException() {

        try {
            FileReader file = new FileReader("C:\\test\\a.test");
            BufferedReader fileInput = new BufferedReader(file);

            for (int counter = 0; counter < 3; counter++) {
                System.out.println(fileInput.readLine());
            }

            fileInput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    public void exampleUncheckedException(){
        int x=0;
        int y=10;
        int z = y/x;
    }
}

/**
 * Checked: Are Exception that are checked at compile time.
 *
 * Unchecked: Are exceptions that are not checked at compile time.
 *
 */

/**
 *      Object  <-- Throwable <-- Exception <--
 * 
 * 
 * 
 */



