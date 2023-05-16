/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject11;

/**
 *
 * @author macac
 */
public class Mavenproject11 {

    public static void main(String[] args) {
         int[] notes = {6, 7, 4, 8, 3, 9}; // Canvia això per a les notes dels teus alumnes
        int aprovats = 0;
        int noAprovats = 0;
        
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] >= 4 && notes[i] < 5) {
                aprovats++;
            } else if (notes[i] >= 5) {
                aprovats++;
            } else {
                noAprovats++;
            }
        }
        
        System.out.println("Nombre d'alumnes aprovats: " + aprovats);
        System.out.println("Nombre d'alumnes no aprovats: " + noAprovats);
    }
}
