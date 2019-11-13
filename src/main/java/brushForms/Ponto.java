package brushForms;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Bruno
 */
public class Ponto extends D1{
    // Por ser um ponto, tem tamanho 1.
    // 2 construtores, um só define o comprimento e o outro já define as coordenadas e a cor
    
    public Ponto(){
        this.comprimento = 1;
    }
    
    public Ponto(int x, int y, Color c){
        this.comprimento = 1;
        this.xi = x;
        this.yi = y;
        this.cor = c;
    }
    
    @Override
    public void draw(Graphics c, boolean info){
        // Chama metodo de desenhar linha com ponto inicial e final igual.
        c.setColor(cor);
        c.drawLine(xi, yi, xi, yi);
    }
}
