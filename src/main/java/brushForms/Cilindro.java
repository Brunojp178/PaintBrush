package brushForms;

import java.awt.Color;
import java.awt.Graphics;
import java.text.DecimalFormat;

public class Cilindro extends D2{
    
    // No cilindro sempre posso calcular raio de x - xi
    // com ele posso estimar um raio menor. como 5 px (pq eu quis)
    
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
        // Variaveis aux.
        int auxY;
        auxY = ((yi + y) - (2 * raioMenor));
        if(corFundo != null){
            c.setColor(corFundo);
            c.fillOval(xi, auxY, x, (Math.abs(auxY - (yi + y))));
            // usa um fill rect pra preencher o meio do cilindro
            c.fillRect(xi, (yi + raioMenor), x, (y - (2 * raioMenor)));
            // seta a cor de fundo um pouco mais clara
            c.setColor(corFundo.brighter());
            c.fillOval(xi, yi, x, ((yi + (2 * raioMenor)) - yi));
        }
        // Como a função de oval precisa da distancia de um ponto inicial ao final
        // tem q calcular o real ponto final pra função de desenhar linha e outros fins
        // realFinal = xi + x;
        c.setColor(cor);
        c.drawOval(xi, yi, x, ((yi + (2 * raioMenor)) - yi));
        c.drawOval(xi, auxY, x, (Math.abs(auxY - (yi + y))));
        c.drawLine(xi, (yi + raioMenor), xi, ((yi + y) - raioMenor));
        c.drawLine((xi + x), (yi + raioMenor), (xi + x), ((yi + y) - raioMenor));
        
        if(info){
            c.setColor(Color.black);
            DecimalFormat numberFormat = new DecimalFormat("#.00");
            c.drawString(numberFormat.format(area) + "", xi, yi);
        }
    }
    
}
