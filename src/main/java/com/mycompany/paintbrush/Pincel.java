package com.mycompany.paintbrush;

import java.awt.Graphics;
import brushForms.*;
import java.awt.Color;
import java.util.ArrayList;

public class Pincel {
    // Classe pincel, classe principal para controle
    // Contem a atual forma do pincel (quadrado, linha, etc)
    // e o tamanho e a referencia ao canvas (tela de desenho)
    // e coordenadas que serão enviadas quando os eventos forem ativos.
    
    // TODO achar um jeito de mexer no tamanho
    public int tamanho;
    public String figura;
    public Graphics canvas;
    public ArrayList<Integer> pointsX = new ArrayList(), pointsY = new ArrayList();
    public int xi, yi, x, y, nPoints;
    public boolean info = false;
    
    // Methods
    public Pincel(){
        figura = "ponto";
        nPoints = 0;
    }
    
    public void savePoint(int x, int y){
        pointsX.add(x);
        pointsY.add(y);
        nPoints++;
    }
    
    public void setInicio(int x, int y){
        this.xi = x;
        this.yi = y;
    }
    
    public void setFim(int x, int y){
        this.x = x;
        this.y = y;
    }
        
    public void drawPonto(Color c){
        Ponto p = new Ponto(xi, yi, c);
        p.draw(canvas, info);
    }
    
    public void drawLinha(Color c){
        Linha l = new Linha(this.xi, this.yi, this.x, this.y, c);
        l.draw(canvas, info);
    }
    
    public void drawRetangulo(Color c, Color f){
        Retangulo r = new Retangulo(this.xi, this.yi, this.x, this.y, c, f);
        r.draw(canvas, info);
    }
    
    public void drawElipse(Color c, Color f){
        Elipse e = new Elipse(this.xi, this.yi, this.x, this.y, c, f);
        e.draw(canvas, info);
    }
    
    public void drawCilindro(Color c, Color f){
        Cilindro e = new Cilindro(this.xi, this.yi, this.x, this.y, c, f);
        e.draw(canvas, info);
    }
    
    public void drawPoligono(Color c, Color f){
        // Cria dois vetores de inteiros
        int xPoints[] = new int[nPoints];
        int yPoints[] = new int[nPoints];
        
        // Copia pontos de arraylist para arrays
        for(int i = 0; i < nPoints; i++){
            xPoints[i] = pointsX.get(i);
            yPoints[i] = pointsY.get(i);
            System.out.println(xPoints[i] + ", " + yPoints[i]);
        }
        Poligono k = new Poligono(xPoints, yPoints, nPoints, c, f);
        k.draw(canvas, info);
        
        // Limpa os pontos e reseta contador
        pointsX.clear();
        pointsY.clear();
        nPoints = 0;
    }
    
    public void erase(){
        Borracha b = new Borracha(this.xi, this.yi, this.x, this.y);
        b.draw(canvas, info);                
    }
}
