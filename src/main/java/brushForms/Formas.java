package brushForms;

import java.awt.Graphics;

/**
 *
 * @author Bruno
 */
public abstract class Formas {
    // Classe contendo coordenadas.
    // Classes de formas herdam dessa.
    // Public pra maior simplicidade.
    public int xi, yi, x, y;
    
    public void draw(Graphics c, boolean info){
        // Implementar nas classes filho
    }
    
}
