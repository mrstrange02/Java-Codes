import java.awt.*;    
import javax.swing.*;    
    
public class Border   
{    
JFrame f;    
Border()  
{    
    f = new JFrame();    
        
     // creating buttons  
    JButton b1 = new JButton("n");
    JButton b2 = new JButton("s");
    JButton b3 = new JButton("e"); 
    JButton b4 = new JButton("w"); 
    JButton b5 = new JButton("c");   
        
    f.add(b1, BorderLayout.NORTH);     
    f.add(b2, BorderLayout.SOUTH);
    f.add(b3, BorderLayout.EAST);  
    f.add(b4, BorderLayout.WEST);     
    f.add(b5, BorderLayout.CENTER);    
        
    f.setSize(300, 300);    
    f.setVisible(true);    
}    
public static void main(String[] args) {    
    new Border();    
}    
}