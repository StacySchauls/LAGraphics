package cpts132.graphics;

import java.awt.Color;

/**
 * A sample component class.
 */
public class X2 extends javax.swing.JComponent {
  private java.awt.Color lc;
  
  /**
   * Constructor, sets the preferred size and the initial color.
   */
  public X2() {
    setPreferredSize(new java.awt.Dimension(25, 25));
    this.setLineColor(java.awt.Color.BLACK);
  }
  
  /**
   * The necessary method. This method
   * renders the component.
   * @param g The Graphics object use to render
   */
  public void paintComponent(java.awt.Graphics g) {
    // paint the background
    super.paintComponent(g);
    g.setColor(lc);
    // draw the two lines
    g.drawLine(0, 0, getWidth()-1, getHeight()-1);
    g.drawLine(0, getHeight()-1, getWidth()-1, 0);
  }
  
  /**
   * Method to get the color of the line
   * @return the color of the line
   */
  public java.awt.Color getLineColor(){
      return lc;
  }
  
  /**
   * Method to set the color of the line
   * @param rgb The color to be set
   */
  public void setLineColor(java.awt.Color rgb){
      lc = rgb;
      repaint();
  }

    
}

