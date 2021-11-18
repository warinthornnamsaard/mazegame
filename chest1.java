import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class chest1 extends chest{

    public chest1(int x, int y) {
        super(x, y);
    }
    public Rectangle getBounds(){
        return new Rectangle(x,y,50,50);
    }
    public BufferedImage getImage(){
        BufferedImage image =null;
        try{
            image= ImageIO.read(new File("chestopen.png"));
            return image;
        }catch(Exception e){
            e.printStackTrace();
        }
        return image;
    }
}
