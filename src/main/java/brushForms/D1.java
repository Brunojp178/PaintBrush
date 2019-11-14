package brushForms;

import java.awt.Color;


public class D1 extends Formas{
    public double comprimento;
    public Color cor;
    //TODO Implementar metodo de converter de px pra metros
    // Função para calcular comprimento
    public void comprimento(){
        double aux = 0;
        aux += Math.pow((x - xi), 2);
        aux += Math.pow((y - yi), 2);
        comprimento = Math.sqrt(aux);
    }
}
