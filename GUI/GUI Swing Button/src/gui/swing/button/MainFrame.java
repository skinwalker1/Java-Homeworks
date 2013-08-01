
package gui.swing.button;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame{
    public MainFrame(String title){
        super(title);
        setLayout(new BorderLayout());
        
        JButton button = new JButton("Click me");
        final JTextArea textArea = new JTextArea();
        
       Container c = getContentPane();
       c.add(textArea,BorderLayout.CENTER);
       c.add(button,BorderLayout.SOUTH);
       
       button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ev) {
                 textArea.append("\n Hello From The Button \n");
                 
            }
       
       });
    }
}
