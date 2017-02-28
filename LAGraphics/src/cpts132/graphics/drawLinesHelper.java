/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpts132.graphics;

import java.awt.Color;

/**
 *
 * @author Stacy
 */
public class drawLinesHelper extends javax.swing.JComponent {
    public drawLinesHelper(){
       setPreferredSize(new java.awt.Dimension(getHeight(), getWidth()));
       
    }
 
    public void paintComponent(java.awt.Graphics g){
        //paint the backgrouns
        super.paintComponent(g);
        g.setColor(Color.black);
        //draw the two verticle lines
        g.drawLine(getWidth()/3, 0, getWidth()/3, getHeight());
        g.drawLine((getWidth()/3)*2, 0 , (getWidth()/3)*2, getHeight());
        //draw the horizontal lines
        g.drawLine(0, getHeight()/3, getWidth(), getHeight()/3);
        g.drawLine( 0 , (getHeight()/3)*2, getWidth(), (getHeight()/3)*2);
    }
}
