import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JDialog;
import java.awt.*;
import java.awt.event.*;

public class Demo5 implements ActionListener
{
    JFrame jf = new JFrame();
    JMenuBar mb = new JMenuBar();
    JMenu m1 = new JMenu("Copy");
    JMenu m2 = new JMenu("Paste");
    JMenu m3 = new JMenu("Cut");
    JMenuItem i1 = new JMenuItem("Copy from Label");
    JMenuItem i2 = new JMenuItem("Copy from TextArea");
    JMenuItem i3 = new JMenuItem("Cut from TextArea");
    JMenuItem i4 = new JMenuItem("Paste into TextArea");
    JDialog d1 = new JDialog(jf,"Done!",false);
    JLabel l1 = new JLabel("This is sample text for copying");
    JLabel l2 = new JLabel();
    JTextArea ta = new JTextArea();
    Demo5()
    {
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setJMenuBar(mb);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        m1.add(i1);
        m1.add(i2);
        m3.add(i3);
        m2.add(i4);
        l1.setBounds(20,50,300,30);
        ta.setBounds(20,100,300,100);
        jf.add(l1);
        jf.add(ta);
        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);
    }
    public void ActionPerformed(ActionEvent e)
    {
        if(e.getSource() == i1)
        {
            String s1 = l1.getText();
        }
    }
    public static void main(String[] args) {
        new Demo5();
    }
}