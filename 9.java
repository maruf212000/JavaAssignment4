import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class demo implements ActionListener{
    JFrame jf = new JFrame();
    JLabel l = new JLabel();
    JButton b1 = new JButton("North");
    JButton b2 = new JButton("South");
    JButton b3 = new JButton("East");
    JButton b4 = new JButton("West");
    demo() {
        /*jf.add(b1,BorderLayout.NORTH);
        jf.add(b2,BorderLayout.SOUTH);
        jf.add(l,BorderLayout.CENTER);
        jf.add(b3,BorderLayout.EAST);
        jf.add(b4,BorderLayout.WEST);*/
        jf.add(b1,BorderLayout.NORTH);
        jf.add(b2,BorderLayout.SOUTH);
        jf.add(b3,BorderLayout.EAST);
        jf.add(b4,BorderLayout.WEST);
        jf.add(l,BorderLayout.CENTER);
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1) {
            l.setText("North");
        }
        if(e.getSource() == b2) {
            l.setText("South");
        }
        if(e.getSource() == b3) {
            l.setText("East");
        }
        if(e.getSource() == b4) {
            l.setText("West");
        }
        
    }
    public static void main(String[] args) {
        new demo();
    }
}