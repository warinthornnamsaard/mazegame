import java.awt.Image;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;
import java.awt.*;


public class LaunchPage extends JPanel implements ActionListener{
 
 JFrame frame = new JFrame();
 JButton myButton = new JButton("Start Game");


 LaunchPage(){
  
  myButton.setBounds(100,160,200,40);
  myButton.setFocusable(false);
  myButton.addActionListener(this);
  frame.setContentPane(new JLabel(new ImageIcon("first_page_resize.jpeg")));
  frame.add(myButton);

  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(420,420);
  frame.setLayout(null);
  frame.setVisible(true);
  
 }

 
 @Override
 public void actionPerformed(ActionEvent e) {
  
  if(e.getSource()==myButton) {
   frame.dispose();
   Display myWindow = new Display();
  }
 }
}