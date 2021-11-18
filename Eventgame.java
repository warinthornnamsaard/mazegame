
public class Eventgame {
    public static int point=0;
    public static boolean checkHit1(Jin player, zombie enemy1) {
        if (player.getBounds().intersects(enemy1.getBounds())) {
            enemy1.speed=0;
            return true;
        }
        return false;
    }
    public static boolean checkHit2(Jin player, zombieline enemy2) {
        if (player.getBounds().intersects(enemy2.getBounds())) {
            enemy2.speed=0;
            return true;
        }
        return false;
    }
    public static boolean checkHit3(Jin player, zombieup enemy3) {
        if (player.getBounds().intersects(enemy3.getBounds())) {
            enemy3.speed=0;
            return true;
        }
        return false;
    }
    public static boolean checkHit4(Jin player, zombieline2 enemy4) {
        if (player.getBounds().intersects(enemy4.getBounds())) {
            enemy4.speed=0;
            return true;
        }
        return false;
    }
    public static boolean checkchestHit1(Jin player , chest chest1){
        if(player.getBounds().intersects(chest1.getBounds())){
            point=point+1;
            return true;
        }
        return false;
    }
    public static boolean checkchestHit2(Jin player , chest chest2){
        if(player.getBounds().intersects(chest2.getBounds())){
            point=point+1;
            return true;
        }
        return false;
    }
    public static boolean checkchestHit3(Jin player , chest chest3){
        if(player.getBounds().intersects(chest3.getBounds())){
            point=point+1;
            return true;
        }
        return false;
    }
    public static boolean checkDoorHit(Jin player , door door){
        if(player.getBounds().intersects(door.getBounds())){
            if(point>3){
                return true;
            }
        }
        return false;
    }
}

