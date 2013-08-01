
package gui.image.android;
import java.awt.*;
import javax.swing.*;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Gui extends JFrame{
    private static String filename = "android.png";
    private  JLabel picture;
    private  Icon pic = new ImageIcon(getClass().getResource(filename));
    
    
    public Gui(String title){
       super(title);
       setLayout(new BorderLayout());

       picture = new JLabel();
       picture.setIcon(pic);
       add(picture,BorderLayout.CENTER);
     
    }
     
}
