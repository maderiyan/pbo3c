/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mi3c;

import java.util.Scanner;

/**
 *
 * @author mader
 */
public class Arraytest {
    public static void main(String[] args) {
        int[] x;
        int[] y = {5,4,3,2,1};
        x = new int[5];
        int i;
        System.out.println("Masukan nilai:");
        Scanner masuk = new Scanner(System.in);
        y[2] = masuk.nextInt();
        System.out.println("data nilai yang dimasukan:");
        for (i=0; i<5; i++) {
            System.out.println(y[i]);
        }
    }
}
