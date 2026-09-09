import javax.swing.*;
//import java.awt.event.*;
//import java.awt.*;

public class form {

    public static void main(String[] args)
    {
        JFrame f = new JFrame("my frame");
        JPanel p = new JPanel();
        JTextField tf = new JTextField();
        
        JLabel l = new JLabel ("enter the name");

        p.setLayout(null);
        l.setBounds(10, 50, 150, 30);
        tf.setBounds(10, 70, 100, 30);
        f.add(p);
        p.add(l);
        p.add(tf);


        f.setVisible(true);
        f.setSize(400,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
