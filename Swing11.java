

// sample gui using actionlistener

import javax.swing.*;

import java.awt.event.*;






 class  Swing11  extends JFrame implements ActionListener 
{
        

       JRadioButton rb1, rb2;

       JButton b;

       Swing11()
       {
              rb1= new JRadioButton("Male");

              rb2= new JRadioButton("Female");

              rb1.setBounds(100,50,100,30);

              rb1.setBounds(100,1000,100,30);

              ButtonGroup bg= new ButtonGroup();


              bg.add(rb1);

              bg.add(rb2);

              b= new JButton("Click");

              b.setBounds(100,150,80,30);

              b.addActionListener(this);

              add(rb1);

              add(rb2);

              add(b);

              setSize(300,300);

              setLayout(null);

              setVisible(true);





       }

       public void actionPerformed(ActionEvent e)
       {
              if(rb1.isSelected())
              {
                     JOptionPane.showMessageDialog(this,"You Are Male");

              }


              if(rb2.isSelected())

              {
                     JOptionPane.showMessageDialog(this,"You Are Female");


              }
       }


       public static void main(String[] args) {
              

              new Swing11();
       }
}
