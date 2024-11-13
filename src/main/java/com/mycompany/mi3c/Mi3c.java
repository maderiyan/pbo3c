/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mi3c;

/**
 *
 * @author mader
 */
import java.util.Scanner;
public class Mi3c {

    public static void main(String[] args) {
        float n;
        System.out.println("Program mulai");
        Scanner input = new Scanner(System.in);
        System.out.println("Input nilai: ");
        n = input.nextFloat();
        if (n>0) {
            System.out.println("positif");
        } else if (n<0) {
            System.out.println("negatif");
        } else {
            System.out.println("nol");
        }
        System.out.println("program selesai");
        System.out.println("program selesai done");
    }
}
