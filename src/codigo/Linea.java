/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author alber
 */
public class Linea {

    int x = 0;
    int y = 0;
    Color color = Color.BLACK;

    public Linea(int _x, int _y, Color _color) {
        x = _x;
        y = _y;
        color = _color;
    }

    public void dibujate(Graphics2D g2, int x2, int y2) {
        g2.setColor(color);
        g2.drawLine(x, y, x2, y2);    
    }
}
