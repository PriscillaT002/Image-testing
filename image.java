import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class image{

  public static void main(String[] args){

    JLabel lbl = new JLabel(new ImageIcon(image.class.getResource("HH.png")));
    JOptionPane.showMessageDialog(null, lbl, "ImageDialog", 
                                 JOptionPane.PLAIN_MESSAGE, null);



  }
}