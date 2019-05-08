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
public class IfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");        
        int i = N % 2;        
        if (i == 1) {
            //odd impar
            System.out.println("Weird");
        } else {
            // even par
            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            }
            if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            }
            if (N > 20) {
                System.out.println("Not Weird");
            }
        }
        scanner.close();
    }
    
}
