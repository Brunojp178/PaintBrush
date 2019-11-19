package brushForms;

import java.awt.Color;
import java.awt.Graphics;

public class Borracha extends Retangulo{
    
    public Borracha(int xi, int yi, int x, int y) {
        super(xi, yi, x, y, Color.white, Color.white);
    }
    
    @Override
    public void draw(Graphics c, boolean info){
        c.setColor(cor);
        c.fillRect(xi, yi, x, y);
    }
}