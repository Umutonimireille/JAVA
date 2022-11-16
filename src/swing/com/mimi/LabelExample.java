package swing.com.mimi;

import javax.swing.*;

public class LabelExample {
    public static void main(String[] args) {

            JFrame f= new JFrame("Label Example");
            JLabel l1,l2;
            l1=new JLabel("First Label.");
            l1.setBounds(50,50, 100,30);
            l2=new JLabel("Second Label.");
            l2.setBounds(50,100, 100,30);
            f.add(l1); f.add(l2);
            JButton b=new JButton("click");
           b.setBounds(150,120,110, 45);
           f.add(b);
            f.setSize(400,500);
            f.setSize(300,300);
            f.setLayout(null);
            f.setVisible(true);
        }
}
