package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author xp
 */
public class Lapiz extends Forma {
    
    public Lapiz(int _posX, int _posY , Color _color, boolean _relleno) {
        super(10, 10, new int[100], new int[100], _color, _relleno, 100 );
    }
}
