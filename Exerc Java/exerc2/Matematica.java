/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercjava2;

/**
 *
 * @author Édison K. dos Santos
 */
public class Matematica {
    double n;
    Matematica(double n) {
        double cinco = 5 * n / 100;
        double cinquenta = 50 * n / 100;
        double centoECinquenta = 150 * n / 100;
        System.out.printf("Cinco porcento do valor = %.1f %n",cinco);
        System.out.printf("Cinquenta porcento do valor = %.2f %n",cinquenta);
        System.out.printf("Cento e cinquenta porcento do valor = %.3f %n",centoECinquenta);
    }
}
