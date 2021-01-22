
package javaapplication6label;

//JLabel kullanımı

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JavaApplication6Label 
{

    public static void main(String[] args) 
    {
       JFrame frame = new JFrame("Tittle");
       JLabel L1 = new JLabel("Text"); 
       L1.setBounds(10,10, 200,50);
       
       JButton button1 = new JButton("hug");
       button1.setBounds(100,200, 100,50);
       JButton button2 = new JButton("gift");
       button2.setBounds(300, 200, 100,50);
       
       button1.addActionListener(new ActionListener() 
       {
           int a = 1;
           @Override
           public void actionPerformed(ActionEvent ae) 
           {
              L1.setText(" TIMES " + a++ + " HUGGED! ");
           }
       });
       
         button2.addActionListener(new ActionListener() 
       {
           int b = 1;
           @Override
           public void actionPerformed(ActionEvent ae) 
           {
              L1.setText(" TIMES " + b++ + " GIFTS GIVEN! ");
           }
       });
       
        frame.add(button1);
        frame.add(button2);
        frame.add(L1);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.show();
    }
    
}
