/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpts132.graphics;

/**
 *
 * @author Stacy
 */
public class O2 extends javax.swing.JComponent{
    private java.awt.Color lc;
    private java.awt.Color fc;
    /**
     * 
     */
     public O2() {
    setPreferredSize(new java.awt.Dimension(25, 25));
    this.setLineColor(java.awt.Color.BLACK);
    this.setFillColor(java.awt.Color.WHITE);
  }
     /**
      * 
      * @param g 
      */
     public void paintComponent(java.awt.Graphics g) {
        // paint the background
        super.paintComponent(g);
        g.setColor(fc);
        g.fillOval(0, 0, getWidth()-1, getHeight()-1);
        g.setColor(lc);
        g.drawOval(0, 0, getWidth()-1, getHeight()-1);
     }
    
    /**
     * 
     * @param rgb 
     */
    public void setLineColor(java.awt.Color rgb){
        lc = rgb;
        repaint();
    }
    
    /**
     * 
     * @param rgb 
     */
    public void setFillColor(java.awt.Color rgb){
        fc = rgb;
        repaint();
        
    }
    
    
}
