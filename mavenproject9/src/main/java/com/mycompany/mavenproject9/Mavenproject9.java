/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject9;

import java.util.Scanner;

/**
 *
 * @author macac
 */
public class Mavenproject9 {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Introdueix un número entre 1 i 10: ");
            num = sc.nextInt();
        } while (num < 1 || num > 10);

        System.out.println("Taula de multiplicar de " + num + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();    }
}
