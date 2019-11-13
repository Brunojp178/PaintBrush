package brushForms;

import java.awt.Color;
import java.awt.Graphics;
/**
 *
 * @author Bruno
 */
public class Linha extends D1{
    
    public Linha(int xi, int yi, int x, int y, Color c){
        this.xi = xi;
        this.yi = yi;
        this.x = x;
        this.y = y;
        this.cor = c;
        this.comprimento();
    }   
    
    @Override
    public void draw(Graphics c, boolean info){
        c.setColor(cor);
        c.drawLine(xi, yi, x, y);
        if(info){
            c.drawString(comprimento + "", xi, yi);
        }
    }
}
