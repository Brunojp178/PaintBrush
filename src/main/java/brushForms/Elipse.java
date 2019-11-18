package brushForms;

import java.awt.Color;
import java.awt.Graphics;
import java.text.DecimalFormat;


public class Elipse extends D2{
    // Raio maior é a distancia do x inicial a x final / 2
    // Raio menor é a distancia do y inicial a y final / 2
    public int raioMaior;
    public int raioMenor;
    
    public Elipse(int xi, int yi, int x, int y, Color cor, Color fundo){
        this.xi = xi;
        this.yi = yi;
        this.x = x;
        this.y = y;
        this.cor = cor;
        if(!(fundo.equals(Color.white))){
            this.corFundo = fundo;
        }else corFundo = null;
        this.area();
    }
    
    @Override
    public void area(){
        // Area de elipse é pi * raios maiores e menores.
        int r1, r2;
        r1 = x - xi;
        r2 = y - yi;
        if(r1 > r2){
            raioMaior = r1;
            raioMenor = r2;
        }else{
            raioMaior = r2;
            raioMenor = r1;
        }
        
        double aux = raioMaior * raioMenor;
        aux = aux * 3.14;
        this.area = Math.abs(aux);
    }
    
    @Override
    public void draw(Graphics c, boolean info){
        if(corFundo != null){
            c.setColor(corFundo);
            c.fillOval(xi, yi, x, y);
        }
        c.setColor(cor);
        c.drawOval(xi, yi, x, y);
        if(info){
            c.setColor(Color.black);
            DecimalFormat numberFormat = new DecimalFormat("#.00");
            c.drawString(numberFormat.format(area) + "", xi, yi);
        }
    }
}
