/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author childm
 */
public class FilledCircle extends AbstractCircle {

    protected double radius;

    public FilledCircle(int x, int y, Color color, double radius) {
        super(x, y, color, radius);
        this.radius = radius;
    }

    protected void paint(Graphics g) {
        g.fillOval((int) (x - radius), (int) (y - radius), (int) (2 * radius), (int) (2 * radius));
    }
}
