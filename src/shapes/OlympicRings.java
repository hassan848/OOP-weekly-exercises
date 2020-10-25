/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author hassan
 */
public class OlympicRings implements Drawable{
    
    private Collection<Circle> circles;

    public OlympicRings(int x, int y) {
        this.circles = new ArrayList<Circle>(5);
        double r = 49.25;
        this.circles.add(new Circle(x + 54, y + 54, new Color(0x0885c2), r));
        this.circles.add(new Circle(x + 171, y + 54, new Color(0x000), r));
        this.circles.add(new Circle(x + 288, y + 54, new Color(0xed334e), r));
        this.circles.add(new Circle(x + 112, y + 104, new Color(0xfbb132), r));
        this.circles.add(new Circle(x + 229, y + 104, new Color(0x1c8b3c), r));
    }

    public void draw(Graphics g) {
        for (Circle c : this.circles) {
            c.draw(g);
        }
    }

    public void erase(Graphics g) {
        for (Circle c : this.circles) {
            c.erase(g);
        }
    }
}

    

