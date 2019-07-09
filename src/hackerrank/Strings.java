/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        int compareTo = A.compareTo(B);
        //System.out.println("compareTo: " + compareTo);
        if (compareTo > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        A = A.substring(0, 1).toUpperCase() + A.substring(1).toLowerCase();
        B = B.substring(0, 1).toUpperCase() + B.substring(1).toLowerCase();
        System.out.println(A + " " + B);
    }

}
