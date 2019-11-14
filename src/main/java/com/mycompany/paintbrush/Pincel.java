package com.mycompany.paintbrush;

import java.awt.Graphics;
import brushForms.*;
import java.awt.Color;

public class Pincel {
    // Classe pincel, classe principal para controle
    // Contem a atual forma do pincel (quadrado, linha, etc)
    // e o tamanho e a referencia ao canvas (tela de desenho)
    // e coordenadas que serão enviadas quando os eventos forem ativos.
    
    // TODO achar um jeito de mexer no tamanho
    public int tamanho;
    public String figura;
    public Graphics canvas;
    public int xi, yi, x, y;
    public boolean info = false;
    
    // Methods
    public Pincel(){
        figura = "ponto";
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
}
