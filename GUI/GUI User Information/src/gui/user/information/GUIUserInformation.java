
package gui.user.information;
import javax.swing.JOptionPane;

public class GUIUserInformation {

    
    public static void main(String[] args) {
       String name = JOptionPane.showInputDialog("Enter your name");
       JOptionPane.showMessageDialog(null, "Hello " + name + "!","User name",JOptionPane.PLAIN_MESSAGE);
        
    }
    
}
