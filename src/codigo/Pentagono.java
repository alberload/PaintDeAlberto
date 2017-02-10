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
    int x = 0;
    int y = 0;
    
    public Pentagono (int _posX, int _posY, int [] _puntosX, int [] _puntosY, int _altura, Color _color, boolean _relleno){
        super(_puntosX, _puntosY, 5);
        this.x = _posX;
        this.y = _posY;

        int radio = 40;

        for (int i=0; i<5; i++){
            this.xpoints[i] = (int) (_posX + radio*Math.cos(2*Math.PI*(i+12)/npoints));
            this.ypoints[i] = (int) (_posY + radio*Math.sin(2*Math.PI*(i+12)/npoints));
        }

        color = _color;
        relleno = _relleno;
    }
    
    public void dibujate(Graphics2D g2, int posY){
        
        
        int radio = this.y - posY;

        for (int i=0; i<5; i++){
            this.xpoints[i] = (int) ( this.x + radio*Math.cos(2*Math.PI*i/npoints));
            this.ypoints[i] = (int) ( this.y + radio*Math.sin(2*Math.PI*i/npoints));
        }
        
        g2.setColor(color);
        if (relleno){
            g2.fill(this);
        }
        else {
            g2.draw(this);
        }
        
    }
}
