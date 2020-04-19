/* Based on the VUW ecs100 template
 *
 */


import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/** 
 * Draws pictures on the graphics pane
 *
 * @author Heather Harper
 * @version 19/04/2020
 */
public class Lollipop {
    // constants for lollipop dimensions
    public static final double X = 300.0; // position from left
    public static final double Y = 180.0; // position from above
    public static final double SIZE = 80.0; // diameter of circle
    public static final double STICK = 200.0; // length of stick
    
    /**
     * Constructor initialises UI class
     */
    public Lollipop() {
        UI.initialise();
        UI.addButton("Quit", UI::quit);    // Comment out to checkstyle
    }

    /**
     * Draw a red lollipop on a stick
     */
    private void drawLollipop() {
        // declare variables for placement of lollipop
        double left = X - (SIZE / 2.0);
        double top = Y - (SIZE / 2.0);
        double bottom = Y + STICK;
        
        // Draw stick
        UI.setLineWidth(SIZE / 8.0);             
        UI.drawLine(X, Y, X, bottom); 
        // Draw lollipop             
        UI.setLineWidth(1);              
        UI.setColor(Color.red);          
        UI.fillOval(left, top, SIZE, SIZE);         
    }
    
    
    /**
     * Main routine
     * 
     * @param args 
     */
    public static void main(String[] args) {
        Lollipop obj = new Lollipop();
        obj.drawLollipop();
    }

}

