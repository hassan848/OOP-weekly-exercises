/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.awt.Color;

/**
 *
 * @author hassan
 */
public class NewOlympicRings extends CompoundShape{
    
    public NewOlympicRings(int x, int y) {
        double r = 49.25;
        addDrawable(new Circle(x + 54, y + 54, new Color(0x0885c2), r));
        addDrawable(new Circle(x + 171, y + 54, new Color(0x000), r));
        addDrawable(new Circle(x + 288, y + 54, new Color(0xed334e), r));
        addDrawable(new Circle(x + 112, y + 104, new Color(0xfbb132), r));
        addDrawable(new Circle(x + 229, y + 104, new Color(0x1c8b3c), r));
        
    }

}

    

