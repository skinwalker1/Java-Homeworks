
package jbutton;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;

public class Gui extends JFrame{
   private JButton reg;
   private JButton custom;
   public Gui(){
       super("The title");
       setLayout(new FlowLayout());
       
       
       reg = new JButton("reg Button");
       add(reg);
       
       Icon b = new ImageIcon(getClass().getResource("b.png"));
       Icon x = new ImageIcon(getClass().getResource("ic.jpg"));
       
       custom = new JButton("Custom",b);
       custom.setRolloverEnabled(true);
       custom.setRolloverIcon(x);
       add(custom);
       
       HandlerClass handler = new HandlerClass();
       reg.addActionListener(handler);
       custom.addActionListener(handler);
          
   }
   private class HandlerClass implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ev) {
         JOptionPane.showMessageDialog(null,String.format("%s",ev.getActionCommand()));
        }
       
   }
   
       
   }

   
    

