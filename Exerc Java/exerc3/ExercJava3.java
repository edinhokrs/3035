/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercjava3;

import java.util.Scanner;

/**
 *
 * @author Édison K. dos Santos
 */
public class ExercJava3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tecl = new Scanner(System.in);
        
        System.out.println("Digite algum valor: ");
        double n1 = tecl.nextDouble();
        System.out.println("Digite outro valor: ");
        double n2 = tecl.nextDouble();
        System.out.println("Qual tipo de operação você deseja efetuar? 1 - soma, 2 - subtração, 3 - multiplicação, 4 - divisão");
        int opc = tecl.nextInt();
        switch(opc) {
            case 1:
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("Número digitado inválido. Encerrando programa.");
        }
    }
    
}
