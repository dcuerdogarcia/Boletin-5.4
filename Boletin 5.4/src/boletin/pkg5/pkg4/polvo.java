/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg5.pkg4;

/**
 *
 * @author User
 */
public class polvo {

    private double pulpo;
    private double patacas;
    int persoas;

    public polvo() {
        pulpo = patacas = 0;
    }
    public polvo(double pulpo, double patacas) {
        this.pulpo = pulpo;
        this.patacas = patacas;
    }

    public void setPulpo(double pul) {
        pulpo = pulpo + pul;
    }
    public double getPulpo() {
        return pulpo;
    }

    public void setPatacas(double pat) {
        patacas = patacas + pat;
    }
    public double getPatacas() {
        return patacas;
    }

    public double cuenta(){
        int a =(int) (3 * patacas);
        int b =(int) (3 * pulpo / 2);
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}

