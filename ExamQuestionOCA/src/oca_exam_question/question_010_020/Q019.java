/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_exam_question.question_010_020;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author mamiri
 */
public class Q019 {
    public static void main(String[] args) throws IOException{
//        Test ex = new Test();
//        int carNo = 12344;
//        ex.checkCard(carNo);    
//        ex.readCard();
        
        FileReader file = new FileReader("C:\\test\\a.txt");
        BufferedReader fileInput = new BufferedReader(file);
        
        if( file instanceof object) {
        
        }
        
        for(int counter=0; counter<3; counter++){
            System.out.println(fileInput.readLine());
        }
        fileInput.close();
        
    }
}


class Test {

    void readCard()throws Exception {
        System.out.println("Reading Card");
    }
    
    void checkCard(int carNo) throws Exception {
        System.out.println("Checking Card");
    }
}
