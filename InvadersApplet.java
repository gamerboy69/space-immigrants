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


// 5 x 11 grid of invaders
// slowly move to side

public class InvadersApplet extends Applet {
    Image picture;
    private animatedObject[] invaders = new animatedObject[5][11];
    /**
     * @param args the command line arguments
     */
    public void init() {
        // TODO code application logic here
        picture = getImage(getDocumentBase(), "alien.png");
    }
    
    public void loadInvaders() {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 11; col++) {
                invaders[row][col] = new animatedObject
            }
        }
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
