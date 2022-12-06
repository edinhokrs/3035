/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercjava1;

import java.util.Scanner;

/**
 *
 * @author Édison K. dos Santos
 */
public class ExercJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float n1, n2, n3;
        Scanner tecl = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        n1 = tecl.nextFloat();
        System.out.println("Digite o segundo número: ");
        n2 = tecl.nextFloat();
        System.out.println("Digite o terceiro número: ");
        n3 = tecl.nextFloat();
        
        
        Matematica soma = new Matematica();
        
        
        soma.somaTot(n1, n2, n3);
        Matematica media = new Matematica();
        media.media(n1, n2, n3);
    }
    
}
