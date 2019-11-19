package brushForms;

// Classe orfão :c

import java.awt.Color;
import java.awt.Graphics;

public class Poligono{
    public int [] pointX;
    public int [] pointY;
    public int nPoints = 0;
    public Color cor, corFundo;
    
    public Poligono(int[] x, int[] y, int n, Color cor, Color fundo){
        this.pointX = x;
        this.pointY = y;
        if(!(fundo.equals(Color.white))){
            this.corFundo = fundo;
        }else corFundo = null;
    }
    
    public void draw(Graphics c, boolean info){
        if(corFundo != null){
            c.setColor(corFundo);
            c.fillPolygon(pointX, pointY, nPoints);
        }
        c.setColor(cor);
        c.drawPolygon(pointX, pointY, nPoints);
    }
}
