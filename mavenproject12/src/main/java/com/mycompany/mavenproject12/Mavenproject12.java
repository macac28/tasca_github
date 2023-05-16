/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject12;

import java.util.Scanner;

/**
 *
 * @author macac
 */
public class Mavenproject12 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix la mida del costat del triangle rectangle: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
    }
}
}
