package cpts132.graphics;
import javax.swing.JFrame;

import java.awt.*;

/**
 *
 * @author Stacy
 */
public class TTT{
    public static void main(String[] args){
   // setup the window
    JFrame win = new JFrame("Tic-Tac-Toe");
    win.setSize(400, 300);
    win.setLayout(new GridLayout(4, 4));
    win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
//    //draw the lines on the board
//    drawLinesHelper lines = new drawLinesHelper();
//    //first component
//    X2 x = new X2();
//    x.setLineColor(Color.blue);
//    win.add(x);
//    //second component
//    O2 o = new O2();
//    o.setFillColor(Color.yellow);
//    o.setLineColor(Color.red);
//    win.add(o);
//    //third component
//    x = new X2();
//    x.setLineColor(Color.blue);
//    win.add(x);
//    //fourth
//    o = new O2();
//    o.setFillColor(Color.yellow);
//    o.setLineColor(Color.red);
//    win.add(o);
//    //fifth
//     x = new X2();
//    x.setLineColor(Color.blue);
//    win.add(x);
//    //ixth
//    win.add(new BlankComponent());
//    //seventh
//    o = new O2();
//    o.setFillColor(Color.yellow);
//    o.setLineColor(Color.red);
//    win.add(o);
//    //eighth
//    win.add(new BlankComponent(), BorderLayout.SOUTH);
//    //ninth
//    x = new X2();
//    x.setLineColor(Color.blue);
//    win.add(x, BorderLayout.PAGE_END);
//    
    
    for(int i = 0; i<16; i++){
        X2 x = new X2();
        x.setLineColor(Color.blue);
        win.add(x);
    }
        
   
    win.setVisible(true);
    }
}
