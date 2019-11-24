package brushForms;

import java.awt.Color;
import java.awt.Graphics;
import java.text.DecimalFormat;


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
            DecimalFormat numberFormat = new DecimalFormat("#.00");
            c.drawString(numberFormat.format(comprimento) + "", xi, yi);
        }
    }
}
