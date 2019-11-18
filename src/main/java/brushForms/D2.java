package brushForms;

import java.awt.Color;


public class D2 extends Formas{
    public double area;
    public Color cor;
    public Color corFundo;
    
    // Area de um quadrado, usar @Override p/ circulo.
    public void area(){
        // Area de um retangulo é base * lado
        double a = Math.abs(x - xi);
        a = a * Math.abs(y - yi);
        area = a;
    }
}
