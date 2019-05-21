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
public class animatedObject {
    private Graphics g;
    private int posX; private int posY; private int width; 
    private int height; 
    private int speedX; private int speedY;
    
    public animatedObject(Graphics graph) {
        g = graph;
    }
    
    public void setup(int x, int y, int width_, int height_, int speedX_, int speedY_) {
        // speed in pixels per second
        posX = x; posY = y; width = width_; height = height_; speedX = speedX_; speedY = speedY_;
    }
    
    public void setVelocity(int speedX, int speedY) {
        this.speedX = speedX; this.speedY = speedY;
    }
    
    public void draw() {
        g.drawRect(posX, posY, width, height);
    }
    
    public void update() {
        g.clearRect(posX, posY, width + 10, height + 10);
        posX += speedX;
        posY += speedY;
        g.drawRect(posX, posY, width, height);
    }
    
    private boolean pointIn(int x, int y) {
        // is x in boundaries?
        if (posX <= x && x <= posX + width) {
            if (posY <= y && y <= posY + height) {
                return true;
            }
        }
        return false;
    }
    
    public boolean rectIn(int x, int y, int rectWidth, int rectHeight) {
        // point at x, y ; x + width, y ; x + width, y + height; x, y + height
        return pointIn(x, y) || pointIn(x + width, y) || pointIn(x + width, y + height) || pointIn(x, y + height);
    }
    
}
