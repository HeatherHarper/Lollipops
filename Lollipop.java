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
     * Draw a red lollipop on a stick
     */
    public Lollipop() {
        UI.initialise();
        //UI.addButton("Quit", UI::quit);    // Comment out to checkstyle
    }

    /**
     * Draw a lollipop on the GUI
     */
    private void drawLollipop() {
        UI.setLineWidth(10);                //set width of stick
        UI.drawLine(300, 200, 300, 400);    // draw line for stick 
                                            //(300, 200) to (300, 400)        
        UI.setLineWidth(1);              // set width of  line to 1
        UI.setColor(Color.red);          // set color to red
        UI.fillOval(260, 160, 80, 80);   // fill oval @(260, 160), 80x80        
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

