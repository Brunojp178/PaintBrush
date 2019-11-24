/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brushForms;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author danie
 */
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
        for (int i = 0; i < 30; i++) {
            if (y != 0) {
                int xNew = (int) ((int) x + rd.nextGaussian() * raio);
                int yNew = (int) ((int) y + rd.nextGaussian() * raio);
                c.setColor(Color.BLACK);
                c.drawLine(xNew, yNew, xNew, yNew);
            }
        }
    }
    
}
