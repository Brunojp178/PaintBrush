package brushForms;

import java.awt.Color;
import java.awt.Graphics;
import java.text.DecimalFormat;

public class Cilindro extends D2{
    
    // No cilindro sempre posso calcular raio de x - xi
    // com ele posso estimar um raio menor. como r / 2
    
    // Altura = y - yi.
    public int altura;
    public Color corFundo2;
    public int raioMaior;
    public int raioMenor;
    
    public Cilindro(int xi, int yi, int x, int y, Color cor, Color fundo) {
        this.xi = xi;
        this.yi = yi;
        this.x = x;
        this.y = y;
        this.cor = cor;
        if(!(fundo.equals(Color.white))){
            this.corFundo = fundo;
        }else corFundo = null;
        
        raioMaior = Math.abs(x - xi)/2;
        raioMenor = 10;
        
        System.out.println("Raios : " + raioMaior + " " + raioMenor);
        this.area();
    }
    
    @Override
    public void area(){
        // Area de elipse é pi * raios maiores e menores.
        this.altura = (y - yi) - 20;
        
        double aux = raioMaior * raioMenor;
        aux = aux * 3.14;
        aux = aux * altura;
        this.area = Math.abs(aux);
    }
    
    @Override
    public void draw(Graphics c, boolean info){
        c.setColor(cor);
        c.drawOval(xi, yi, x, ((yi + 10) - yi));
        c.drawOval(x, y, xi, ((y + 10) - y));
//        int fimYa; 
//        
//        c.setColor(cor);
//        // 2 * raioMenor = diametro menor
//        fimYa = yi + (2*raioMenor);
//        // Primeira elipse
//        c.drawOval(xi, yi, x, fimYa);
//        
//        // segunda elipse
//        fimYa = y - (2*raioMenor);
//        c.drawOval(xi, fimYa, x, y);
//        // Linhas da borda
//        c.drawLine(xi, (yi + raioMenor), xi, (y - raioMenor));
//        c.drawLine(x, (yi + raioMenor), x, (y - raioMenor));
//        if(info){
//            c.setColor(Color.black);
//            DecimalFormat numberFormat = new DecimalFormat("#.00");
//            c.drawString(numberFormat.format(area) + "", xi, yi);
//        }
    }
    
}
