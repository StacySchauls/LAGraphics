package cpts132.graphics;

/**
 * Component class to draw ovals
 * @author Stacy Schauls
 * @version Plus
 */
public class O2 extends javax.swing.JComponent{
    //cline color and fill color
    private java.awt.Color lc;
    private java.awt.Color fc;
    /**
     * constructor, sets the preferred size, and the initial colors.
     */
     public O2() {
    setPreferredSize(new java.awt.Dimension(25, 25));
    this.setLineColor(java.awt.Color.BLACK);
    this.setFillColor(java.awt.Color.WHITE);
  }
     /**
      * The method to render the component
      * @param g The graphics object use to render
      */
     public void paintComponent(java.awt.Graphics g) {
        // paint the background
        super.paintComponent(g);
        //set the color of the oval the fill it, then set the color and drwa the outline
        g.setColor(fc);
        g.fillOval(0, 0, getWidth()-1, getHeight()-1);
        g.setColor(lc);
        g.drawOval(0, 0, getWidth()-1, getHeight()-1);
     }
    
    /**
     * Method to set the color of the lines
     * @param rgb the color to be set
     */
    public void setLineColor(java.awt.Color rgb){
        lc = rgb;
        repaint();
    }
    
    /**
     * method to set the fill color a shape
     * @param rgb color to be set
     */
    public void setFillColor(java.awt.Color rgb){
        fc = rgb;
        repaint();
        
    }
    
    /**
     * method to get the line color of the shape
     * @return the color of the line
     */
    public java.awt.Color getLineColor(){
        return lc;
    }
    
    /**
     * Method to get the color of the filled shape
     * @return the filled color
     */
    public java.awt.Color getFillColor(){
        return fc;
    }
}
