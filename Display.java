
import javax.swing.*;
import java.awt.*;

public class Display extends JFrame {
    private Dimension size =new Dimension(1040,820);
    public Display(){
        this.displaySetting();
        this.getContentPane().add(new Gameplay());
    }
    private void displaySetting(){
        this.setTitle("MAZE GAME");
        this.setSize(size);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(300,200);
        this.setVisible(true);
    }
    // public static void main(String[] args){
    //     Display window = new Display();
    // }
}
