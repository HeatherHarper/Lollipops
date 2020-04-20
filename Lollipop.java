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
    /**
     * Constructor initialises UI class
     */
    public Lollipop() {
        UI.initialise();
        UI.addButton("Quit", UI::quit);    // Comment out to checkstyle
    }

    /**
     * Draw 3 lollipops at set places but ask user for size
     */
    private void doDrawLollipop(){
        double diameter = UI.askDouble("Diameter: ");
        
        drawLollipop(300.0, 180.0, diameter, 200.0);
        drawLollipop(50.0, 60.0, diameter/2.0, 90.0);
        drawLollipop(400.0, 100.0, diameter, 70.0);
    }
    
    /**
     * Draw a red lollipop on a stick
     * 
     * @param x a double for the horizontal position
     * @param y a double for the vertical position
     * @param size a double for the diameter of the lollipop circle
     * @param stick a double fo rthe length of the lollipop stick
     */
    private void drawLollipop(double x, double y, double size, double stick) {
        // declare variables for placement of lollipop
        double left = x - (size / 2.0);
        double top = y - (size / 2.0);
        double bottom = y + stick;
        
        // Draw stick
        UI.setColor(Color.black);
        UI.setLineWidth(size / 8.0);             
        UI.drawLine(x, y, x, bottom); 
        // Draw lollipop             
        UI.setLineWidth(1);              
        UI.setColor(Color.red);          
        UI.fillOval(left, top, size, size);         
    }
    
    
    /**
     * Main routine
     * 
     * @param args 
     */
    public static void main(String[] args) {
        Lollipop obj = new Lollipop();
        obj.doDrawLollipop();
    }

}

