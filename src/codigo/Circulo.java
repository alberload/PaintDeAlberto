package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author alber
 */
public class Circulo extends Forma {
    
    public Circulo(int _posX, int _posY , Color _color, boolean _relleno) {
        super(_posX, _posY, new int[100], new int[100], _color, _relleno, 100 );
    }
}
