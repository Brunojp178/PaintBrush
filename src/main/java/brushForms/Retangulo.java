package brushForms;

import java.awt.Color;
import java.awt.Graphics;
import java.text.DecimalFormat;


public class Retangulo extends D2{
    
    /**
     * Construtor
     * @param xi - ponto x inicial
     * @param yi - ponto y inicial
     * @param x - ponto x final
     * @param y - ponto y final
     * @param cor - cor das bordas do retangulo
     * @param fundo - cor do fundo do retangulo (se for branco, fundo transparente)
     */
    public Retangulo(int xi, int yi, int x, int y, Color cor, Color fundo){
        this.xi = xi;
        this.yi = yi;
        this.x = x;
        this.y = y;
        this.cor = cor;
        if(!(fundo.equals(Color.white))){
            this.corFundo = fundo;
        }else corFundo = null;
        area();
    }
    
    @Override
    public void draw(Graphics c, boolean info){
        if(corFundo != null){
            c.setColor(corFundo);
            c.fillRect(xi, yi, x, y);
        }
        c.setColor(cor);
        c.drawRect(xi, yi, x, y);
        if(info){
            c.setColor(Color.black);
            DecimalFormat numberFormat = new DecimalFormat("#.00");
            c.drawString(numberFormat.format(area) + "", xi, yi);
            c.drawString(area + "", xi, yi);
        }
    }
}
