/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_exam_question.question_010_020;

/**
 *
 * @author mamiri
 */
public class Q019 {
    public static void main(String[] args) {
        Test ex = new Test();
        int carNo = 12344;
        ex.checkCard(carNo);    
        ex.readCard();
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
