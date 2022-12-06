/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercjava1;

/**
 *
 * @author Édison K. dos Santos
 */
public class Matematica {
    
    float somaTot(float n1, float n2, float n3) {
        float soma = n1 + n2 + n3;
        System.out.printf("Soma de %.2f %n", soma);
        return soma;
    }
    float media(float n1, float n2, float n3) {
        float media = (n1 + n2 + n3) / 3;
        System.out.printf("Média de %.2f %n", media);
        return media;
    }
}
