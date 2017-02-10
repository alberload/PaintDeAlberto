/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author Jorge Cisneros
 */
public class Pentagono extends Polygon{
    
    Color color = null;
    boolean relleno = false;
    
    public Pentagono (int _posX, int _posY, int _altura, Color _color, boolean _relleno){
        
//número de puntos que tiene el polígono
        this.npoints = 5;
        int radio = 40;
        

        for (int i=0; i<4; i++){
            this.xpoints[i] = (int) (140 + radio*Math.cos(2*Math.PI*(i+40)/npoints));
            this.ypoints[i] = (int) (320 + radio*Math.sin(2*Math.PI*(i+40)/npoints));
        }
        
        double puntoX;
        double puntoY;
        for (int i=4; i<5; i++){
            puntoX =  140 + radio*Math.cos(2*Math.PI*(i+40)/npoints);
            puntoY =  320 + radio*Math.sin(2*Math.PI*(i+40)/npoints);
            addPoint((int)puntoX, (int)puntoY);
        }
        color = _color;
        relleno = _relleno;
    }
    
    public void dibujate(Graphics2D g2, int posY){
   
        g2.setColor(color);
        if (relleno){
            g2.fill(this);
        }
        else {
            g2.draw(this);
        }
        
    }
}
