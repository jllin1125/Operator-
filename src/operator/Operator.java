/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator;

/**
 *
 * @author class
 */
public class Operator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int  test1 = 90, test2 = 90, test3 = 91;
        double average;
        average= (test1 + test2 + test3)/3.0;
        System.out.println("The score of test 1 is " + test1);
        System.out.println("The score of test 2 is " + test2);
        System.out.println("The score of test 3 is " + test3);
        System.out.println("The average of three test score are " + average);
    }

}
