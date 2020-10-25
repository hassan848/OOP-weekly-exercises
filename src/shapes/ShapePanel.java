/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Collection;
import java.util.LinkedHashSet;
import javax.swing.*;

/**
 *
 * @author childm
 */
public class ShapePanel extends JPanel {
    
    private final Collection<Drawable> drawables = new LinkedHashSet<Drawable>();
    
    public ShapePanel() {
        setOpaque(true);
        setBackground( Color.WHITE);
        setPreferredSize( new Dimension(1200, 1200));
    }
    
    public void addDrawable(Drawable d) {
        this.drawables.add(d);
        repaint();
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g = g.create();
        for(Drawable d : this.drawables) {
            d.draw(g);
        }
    }
    
    private static void launch() {
        ShapePanel p = new ShapePanel();
        JFrame f = new JFrame("Shapes");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(p);
        f.pack();
        f.setVisible(true);
        
        p.addDrawable( new Square( 10, 10, Color.blue, 50));
        p.addDrawable( new Circle( 200, 240, Color.green, 50));
        
        //Creating my own shapes for task 6;
        p.addDrawable(new Square(300,10, Color.MAGENTA,150));
        p.addDrawable(new Circle(480, 450,Color.GRAY, 100));
        
        //Adding the olympic rings to the Jframe
        //p.addDrawable(new OlympicRings(20, 380));
        
        //filling new shapes
        p.addDrawable(new FilledSquare( 10, 70, Color.blue, 50));
        p.addDrawable(new FilledCircle( 400, 240, Color.green, 50));
        
        //Adding new OlympicRings objects/Shapes;
        p.addDrawable(new NewOlympicRings(20, 380));
        
        //Picture in square, task 17
        p.addDrawable(new CircleInSquare(700,700,Color.BLUE, Color.PINK,50));
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater( () -> ShapePanel.launch());
    }
    
}
