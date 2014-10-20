//Write by Seijas
package boletin5.pkg04;

public class Polvo {

    private double pulpo;
    private double patacas;
    int persoas;

    //Constructores
    public Polvo() {
        pulpo = patacas = 0;
    }
    public Polvo(double pulpo, double patacas) {
        this.pulpo = pulpo;
        this.patacas = patacas;
    }

    //Metodos de aceso
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
//Create by the best programer arround the worl: Seijas
//To my Fans