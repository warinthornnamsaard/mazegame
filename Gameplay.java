
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

public class Gameplay extends JPanel implements KeyListener {
    Jin player = new Jin(90,50);
    zombie enemy1 = new zombie(800, 470, 20, this);
    zombieline enemy2 = new zombieline(900, 200, 20, this);
    zombieup enemy3 = new zombieup(215, 150, 20, this);
    zombieline2 enemy4 = new zombieline2(350, 620, 20, this);
    door door = new door(950,700);
    End end = new End(0,0);
    win win = new win(0,0);
    chest chest1 = new chest(300,5);
    chest chest2 = new chest(100,620);
    chest chest3 = new chest(620,200);
    chest1 chesta1 = new chest1(300,5);
    chest2 chesta2 = new chest2(100,620);
    chest3 chesta3 = new chest3(620,200);
    public Gameplay() {
        this.setBounds(0, 0, 1024, 786);
        this.addKeyListener(this);
        this.setFocusable(true);
        this.setLayout(null);
    }
    public void paint(Graphics g) {
        try {
            super.paint(g);
            Graphics2D gtd = (Graphics2D) g;
            this.drawBackground(gtd);
            EndGame(gtd);
            Hitchest(gtd);
            gtd.drawImage(player.getImage(), player.x, player.y, player.getBounds().width, player.getBounds().height, null);
            gtd.drawImage(enemy1.getImage(), enemy1.x, enemy1.y, enemy1.getBounds().width, enemy1.getBounds().height, null);
            gtd.drawImage(enemy1.getImage(), enemy2.x, enemy2.y, enemy2.getBounds().width, enemy2.getBounds().height, null);
            gtd.drawImage(enemy1.getImage(), enemy3.x, enemy3.y, enemy3.getBounds().width, enemy3.getBounds().height, null);
            gtd.drawImage(enemy1.getImage(), enemy4.x, enemy4.y, enemy4.getBounds().width, enemy4.getBounds().height, null);
            gtd.drawImage(door.getImage(), door.x,door.y,door.getBounds().width,door.getBounds().height,null);
            gtd.drawImage(chest1.getImage(), chest1.x, chest1.y,chest1.getBounds().width, chest1.getBounds().height, null);
            gtd.drawImage(chest2.getImage(), chest2.x, chest2.y, chest2.getBounds().width, chest2.getBounds().height, null);
            gtd.drawImage(chest3.getImage(), chest3.x, chest3.y, chest1.getBounds().width, chest3.getBounds().height, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void drawBackground(Graphics2D gtd) throws IOException {
        gtd.drawImage(ImageIO.read(new File("mapmazelast.jpg")), 0, 0, 1024, 786, null);
        gtd.setFont(new Font("TimesRoman", Font.BOLD, 20));
        gtd.drawString("Point = " + Eventgame.point, 30, 20);
    }
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println(e.getKeyCode());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 38) {
            player.moveu(this);
            this.repaint();
        }
        if (e.getKeyCode() == 40) {
            player.moved(this);
            this.repaint();
        }
        if (e.getKeyCode() == 39) {
            player.mover(this);
            this.repaint();
        }
        if (e.getKeyCode() == 37) {
            player.movel(this);
            this.repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    public void EndGame(Graphics2D gtd){
        if (Eventgame.checkHit1 (player, enemy1)) {
            gtd.drawImage(end.getImage(),end.x,end.y,end.getBounds().width,end.getBounds().height,null);
        }
        else if (Eventgame.checkHit2(player, enemy2)) {
            gtd.drawImage(end.getImage(),end.x,end.y,end.getBounds().width,end.getBounds().height,null);
        }
        else if (Eventgame.checkHit3(player, enemy3)) {
            gtd.drawImage(end.getImage(),end.x,end.y,end.getBounds().width,end.getBounds().height,null);
        }
        else if (Eventgame.checkHit4(player, enemy4)) {
            gtd.drawImage(end.getImage(),end.x,end.y,end.getBounds().width,end.getBounds().height,null);
        }
        else if(Eventgame.checkDoorHit(player,door)){
            gtd.drawImage(win.getImage(), win.x,win.y,win.getBounds().width,win.getBounds().height,null);
        }
    }
    private void Hitchest(Graphics2D gtd){
        if(Eventgame.checkchestHit1(player,chest1 )){
            gtd.drawImage(chesta1.getImage(), chesta1.x,chesta1.y,chesta1.getBounds().width,chesta1.getBounds().height,null);
        }
        else if(Eventgame.checkchestHit2(player, chest2)){
            gtd.drawImage(chesta2.getImage(), chesta2.x,chesta2.y,chesta2.getBounds().width,chesta2.getBounds().height,null);
        }
        else if(Eventgame.checkchestHit3(player, chest3)){
            gtd.drawImage(chesta3.getImage(), chesta3.x,chesta3.y,chesta3.getBounds().width,chesta3.getBounds().height,null);
        }
    }
}


