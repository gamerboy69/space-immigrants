/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invadersapplet;
import java.awt.*;
import java.applet.*;


/**
 *
 * @author matthewdaly
 */


public class InvadersApplet extends Applet {
    Image picture;
    /**
     * @param args the command line arguments
     */
    public void init() {
        // TODO code application logic here
        picture = getImage(getDocumentBase(), "alien.png");
    }
    
    public void paint(Graphics g) {
        for (int i=0; i < 500; i++) {
            g.drawImage(picture, i, 30, this);
            g.clearRect(5 + (i - 1), 5 + (i - 1), 40, 40);
            g.drawRect(5 + i, 5 + i, 30, 30);
            
            try {
                Thread.sleep(100);
            } catch(Exception e) {
                
            }
        }
    }
    
}
