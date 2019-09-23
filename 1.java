import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;

class demo1
{
    JFrame f1 = new JFrame();
    JLabel l1 = new JLabel("UserName:- ");
    JLabel l2 = new JLabel("New Password:- ");
    JLabel l3 = new JLabel("Re-enterPassword:- ");
    JLabel err = new JLabel();
    JTextField t1 = new JTextField();
    JPasswordField p1 = new JPasswordField();
    JPasswordField p2 = new JPasswordField();
    JButton b1 = new JButton("Submit");
    demo1()
    {
        f1.setSize(500,500);
        f1.setVisible(true);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
        l1.setBounds(50,50,100,30);
        t1.setBounds(170,50,200,30);
        l2.setBounds(50,100,100,30);
        p1.setBounds(170,100,200,30);
        l3.setBounds(50,150,130,30);
        p2.setBounds(170,150,200,30);
        b1.setBounds(175,200,80,30);
        err.setBounds(100,250,200,30);
        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(p1);
        f1.add(l3);
        f1.add(p2);
        f1.add(b1);
        f1.add(err);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String pwd1 = p1.getText();
                String pwd2 = p2.getText();
                if(pwd1.equals(pwd2))
                {
                    err.setText("Password Changed Successfully");
                }
                else{
                    err.setText("Password doesnot match");
                }
            }
        });
    }
    public static void main(String[] args) {
        new demo1();
    }
}