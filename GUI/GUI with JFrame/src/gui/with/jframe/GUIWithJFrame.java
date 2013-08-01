
package gui.with.jframe;
import javax.swing.JFrame;

public class GUIWithJFrame {

    
    public static void main(String[] args) {
       tuna tunaObject = new tuna();
       tunaObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tunaObject.setSize(400,400);
        tunaObject.setVisible(true);
        
    }
}
