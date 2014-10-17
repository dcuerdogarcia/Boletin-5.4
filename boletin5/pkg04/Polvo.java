//Write by Seijas
package boletin5.pkg04;

public class Polvo {
    double pulpo;
    double patacas;
    int persoas;
    
    //Constructores
    public Polvo(){
        pulpo=patacas=0;
    }
    
    public Polvo(double pulpo, double patacas){
        this.pulpo=pulpo;
        this.patacas=patacas;
    }
    
    public int numClientes(int persoas){
        this.persoas=persoas;
        return persoas;
    }
    
    //Metodos de aceso
    public void setPulpo(double pulpo){
        this.pulpo=pulpo; 
    }
    public double getPulpo(){
        return pulpo;
    }
    
    public void setPatacas(double patacas){
        this.patacas=patacas;
    }
    public double getPatacas(){
        return patacas;
    }

}
//Create by the best programer arround the worl: Seijas
//To my Fans