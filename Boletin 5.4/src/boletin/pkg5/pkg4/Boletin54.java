/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg5.pkg4;

public class Boletin54 {

    public static void main(String[] args) {
        polvo clientela1 = new polvo();
        polvo clientela2 = new polvo(10, 6);
        
        System.out.println("La cantidad de clientela que se podra atender con " + clientela2.getPulpo() + "Kg de Pulpo y " + clientela2.getPatacas() + "Kg de patacas e de " + clientela2.cuenta() + " persoas");
    }
}