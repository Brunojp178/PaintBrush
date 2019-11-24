package brushForms;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Spray extends D1{
    
     public double raio;

    public Spray(int xi, int yi, int x, int y, Color cor, double raio) {
        this.xi = xi;
        this.yi = yi;
        this.x = x;
        this.y = y;
        this.cor = cor;
        this.raio = raio;
    }

    @Override
    public void draw(Graphics c, boolean info) {
        Random rd = new Random();
        c.setColor(this.cor);
        for (int i = 0; i < 30; i++) {
            if (y != 0) {
                int xNew = (int) ((int) x + rd.nextGaussian() * raio);
                int yNew = (int) ((int) y + rd.nextGaussian() * raio);
                c.drawLine(xNew, yNew, xNew, yNew);
            }
        }
    }
    
}
