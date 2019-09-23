import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;

class Demo3
{
    JFrame f1 = new JFrame("Combobox Frame");
    JLabel l1 = new JLabel();
    JButton b1 = new JButton("Show");
    Demo3()
    {
        String s1[] = {"banana","apple","watermelon","pomogranate","plum","orange","mango"};
        JComboBox c1 = new JComboBox(s1);
        f1.setSize(500,500);
        f1.setVisible(true);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
        c1.setBounds(50,50,100,30);
        b1.setBounds(200,50,100,30);
        l1.setBounds(50,200,100,30);
        f1.add(c1);
        f1.add(b1);
        f1.add(l1);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String s2 = c1.getSelectedItem().toString();
                l1.setText(s2);
            }
        });
    }
    public static void main(String[] args) {
        new Demo3();
    }
}