
package gui.image.android;
import javax.swing.JFrame;

public class GuiImageAndroid {

    
    public static void main(String[] args) {
       Gui go = new Gui("Android");
       go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       go.setVisible(true);
       go.setSize(500,400);
       go.setResizable(false);
    }
}
