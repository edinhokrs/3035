/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercjava2;

import java.util.Scanner;

/**
 *
 * @author Édison K. dos Santos
 */
public class ExercJava2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tecl = new Scanner(System.in);
        double n1;
        System.out.println("Digite algum número: ");
        n1 = tecl.nextDouble();
        Matematica mat = new Matematica(n1);
        
           
        
    }
    
}
