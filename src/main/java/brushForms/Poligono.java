package brushForms;

// Classe orfão :c

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Poligono{
    public int [] pointX;
    public int [] pointY;
    public int nPoints = 0;
    public Color cor, corFundo;
    
    public Poligono(int[] x, int[] y, int n, Color cor, Color fundo){
        System.out.println("Instanciado");
        this.pointX = x.clone();
        this.pointY = y.clone();
        this.nPoints = n;
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
        Polygon p = new Polygon(pointX, pointY, nPoints);
        c.drawPolygon(p);
    }
}
