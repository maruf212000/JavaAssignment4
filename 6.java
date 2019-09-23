import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;

class Demo6 extends WindowAdapter
{
    JFrame jf = new JFrame();
    Demo6()
    {
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setLayout(new FlowLayout());
        JOptionPane.showMessageDialog(jf,"Frame Opened","Message",JOptionPane.INFORMATION_MESSAGE);
        jf.addWindowListener(this);
    }
    public void windowClosing(WindowEvent e)
    {
        int a= JOptionPane.showConfirmDialog(jf,"Are you Sure?");
        if(a==JOptionPane.YES_OPTION){  
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        }  
    }
    public static void main(String[] args) {
        new Demo6();
    }
}