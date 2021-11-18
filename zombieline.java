import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class zombieline extends zombie{
    public zombieline(int x, int y, int speed, JPanel game) {
        super(x, y, speed, game);
    }
    public void move(JPanel game){
        Timer timer = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x-=speed;
                game.repaint();
                if(x==900){
                    speed=10;
                }
                if(x==620){
                    speed=-10;
                }
            }
        });
        timer.start();
    }
    public Rectangle getBounds(){
        return new Rectangle(x,y,50,50);
    }
    public BufferedImage getImage(){
        BufferedImage image =null;
        try{
            image= ImageIO.read(new File("zombiel.png"));
            return image;
        }catch(Exception e){
            e.printStackTrace();
        }
        return image;
    }
}
